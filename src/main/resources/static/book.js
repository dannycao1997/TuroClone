document.getElementById('booking-form').addEventListener('submit', function(event) {
    event.preventDefault();

    const formData = new FormData(event.target);
    const rentalData = {
        carId: formData.get('carId'),
        userId: formData.get('userId'),
        startDate: formData.get('startDate'),
        endDate: formData.get('endDate'),
    };

    fetch('http://localhost:8080/api/rentals', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(rentalData)
    })
        .then(response => {
            if (!response.ok) {
                throw new Error(`HTTP error! status: ${response.status}`);
            }
            return response.json();
        })
        .then(bookingConfirmation => {
            console.log('Booking successful:', bookingConfirmation);
        })
        .catch(error => {
            console.error('Error creating booking:', error);
        });
});
