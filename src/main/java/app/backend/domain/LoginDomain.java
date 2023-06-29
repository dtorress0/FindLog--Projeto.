package app.backend.domain;

/**
 *
 * @author 23162795
 */
public class LoginDomain {
    
    private String usuario;
    private String senha;
    private boolean loginExiste;

    public boolean isLoginExiste() {
        return loginExiste;
    }

    public void setLoginExiste(boolean loginExiste) {
        this.loginExiste = loginExiste;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Login{" + "usuario=" + usuario + ", senha=" + senha + '}';
    }
    
    
}
