public abstract class Peminjam implements UserLogin {
    
    private boolean isLogin;

    @Override
    public void doLogin(){
        System.out.println("Peminjam berhasil login");
        this.isLogin = true;
    }

    @Override
    public void doLogout(){
        System.out.println("Peminjam berhasil logout");
        this.isLogin = false;
    }

    @Override
    public boolean isLogin(){
        return this.isLogin;
    }

    public abstract void setKodePeminjam(String kodePeminjam);
    public abstract String getKodePeminjam();
    public abstract void setNamaPeminjam(String namaPeminjam);
    public abstract String getNamaPeminjam();
}