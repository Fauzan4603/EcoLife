public class User {
    private String nama;
    private String userName;
    private String email;
    private String password;
    private boolean isLoggedIn;

    public User(String nama, String userName, String email, String password) {
        this.nama = nama;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.isLoggedIn = false;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean login(String enteredPassword) {
        if (enteredPassword.equals(password)) {
            isLoggedIn = true;
            System.out.println("Login berhasil.");
            return true;
        } else {
            System.out.println("Login gagal. Password salah.");
            return false;
        }
    }

    public void logout() {
        isLoggedIn = false;
        System.out.println("Logout berhasil.");
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void displayUserData() {
        System.out.println("Data Pengguna:");
        System.out.println("Nama: " + nama);
        System.out.println("Username: " + userName);
        System.out.println("Email: " + email);
        // Anda mungkin ingin menghindari mencetak kata sandi di sini
        // System.out.println("Password: " + password);
        System.out.println("Status Login: " + (isLoggedIn ? "Sedang Login" : "Sedang Logout"));
    }


}