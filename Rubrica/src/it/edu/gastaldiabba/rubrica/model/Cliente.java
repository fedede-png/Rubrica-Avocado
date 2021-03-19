
package it.edu.gastaldiabba.rubrica.model;

public class Cliente {
    
    private String ragioneSociale;
    private int cap;
    private String email;
    private String indirizzo;
    private int nTelefono;
    private String citta;
    private String iva;
    private String note;
    private int affidabilita;
    
    public void setRagioneSociale(String r){
		ragioneSociale = r;
	}
		public String getRagioneSociale(){
		return ragioneSociale;
	}
                
    public void setCap(int c){
		cap = c;
	}
		public int getCap(){
		return cap;
	}
                
    public void setEmail(String e){
		email = e;
	}
		public String getEmail(){
		return email;
	}
          
    public void setIndirizzo(String i){
		indirizzo = i;
	}
		public String getIndirizzo(){
		return indirizzo;
	}
                
    public void setNTelefono(int n){
		nTelefono = n;
	}
		public int getNTelefono(){
		return nTelefono;
	}
                
    public void setCitta(String ct){
		citta = ct;
	}
		public String getCitta(){
		return citta;
	}
                
    public void setIva(String v){
		iva = v;
	}
		public String getIva(){
		return iva;
	}
                
    public void setNote(String not){
		note = not;
	}
		public String getNote(){
		return note;
	}
                
    public void setAffidabilita(int a){
		affidabilita = a;
	}
		public int getAffidabilita(){
		return affidabilita;
	}
                
    public Cliente(){

    }
    
    public Cliente(String r, int c, String e, String i, int n, String ct, String v, String not, int a){
            ragioneSociale = r;
            cap = c;
            email = e;
            indirizzo = i;
            nTelefono = n;
            citta = ct;
            iva = v;
            note = not;
            affidabilita = a;
    }
        
}