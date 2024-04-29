document.addEventListener('DOMContentLoaded', function() {
    const fleetContainer = document.getElementById('fleet-container');

    fetch('http://localhost:8080/api/cars')
        .then(response => {
            if (!response.ok) {
                throw new Error(`HTTP error! status: ${response.status}`);
            }
            return response.json();
        })
        .then(cars => {
            cars.forEach(car => {
                const carElement = document.createElement('div');
                carElement.innerHTML = `
                <h3>${car.make} ${car.model}</h3>
                <p>Year: ${car.year}</p>
                <p>License Plate: ${car.licensePlate}</p>
            `;
                fleetContainer.appendChild(carElement);
            });
        })
        .catch(error => {
            console.error('Error fetching fleet:', error);
            fleetContainer.innerHTML = `<p>Error loading cars. Please try again later.</p>`;
        });
});
