
document.addEventListener("DOMContentLoaded", function() {

    const navLinks = document.querySelectorAll('.nav-links a');

    navLinks.forEach(link => {
        if (link.href == window.location.href) {
            link.classList.add('active');
        }
		
		link.addEventListener('click',function(){
			navLinks.forEach(item => item.classList.remove('active'));
			this.classList.add('active');
		});
    });
    
});


function togglePassword() {

    const password =
        document.getElementById("password");

    const eye =
        document.querySelector(".toggle-password");

    if (password.type === "password") {

        password.type = "text";

        eye.classList.remove("fa-eye");
        eye.classList.add("fa-eye-slash");

    } else {

        password.type = "password";

        eye.classList.remove("fa-eye-slash");
        eye.classList.add("fa-eye");

    }
}


function toggleRegisterPassword() {

    const password =
        document.getElementById("registerPassword");

    const icon =
        document.querySelector(".password-box i");

    if (password.type === "password") {

        password.type = "text";

        icon.classList.remove("fa-eye");
        icon.classList.add("fa-eye-slash");

    } else {

        password.type = "password";

        icon.classList.remove("fa-eye-slash");
        icon.classList.add("fa-eye");

    }
}