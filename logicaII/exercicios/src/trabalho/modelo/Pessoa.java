package trabalho.modelo;

public class Pessoa {
        private Integer id;
        private String nome;
        private String email;

        public Pessoa(Integer id, String nome, String email) {
                this.id = id;
                this.nome = nome;
                this.email = email;
        }

        public Pessoa() {

        }

        public void imprimir(){
                System.out.println(id);
                System.out.println(nome);
                System.out.println(email);
        }
        public Integer getId() {
                return id;
        }
        public void setId(Integer id) {
                this.id = id;
        }
        public String getNome() {
                return nome;
        }
        public void setNome(String nome) {
                this.nome = nome;
        }
        public String getEmail() {
                return email;
        }
        public void setEmail(String email) {
                this.email = email;
        }

        @Override
        public String toString() {
                return "Id "+id+", Nome: "+nome+", Email: "+email;
        }

        @Override
        public boolean equals(Object obj) {

                boolean status = super.equals(obj);
                if(status)
                        System.out.println("É verdade!");
                else
                        System.out.println("É falso!");
                return status;
        }
}
