document.addEventListener('DOMContentLoaded', function() {
    document.getElementById('booking-form').addEventListener('submit', function(e) {
        e.preventDefault();

        var formData = new FormData(this);

        fetch('/api/rentals', {
            method: 'POST',
            body: JSON.stringify({
            }),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(function(response) {
            return response.json();
        }).then(function(json) {
        }).catch(function(error) {
        });
    });
});
