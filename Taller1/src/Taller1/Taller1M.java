
package Taller1;


public class Taller1M {
    public int LuisC,LuisL, LuisM,LuisP, TotalLuis;
    public int PedroC,PedroL,PedroM,PedroP, TotalPedro;
    public int JoseC,JoseL,JoseM,JoseP, TotalJose;
    public int AnaC,AnaL,AnaM,AnaP, TotalAna;
    public int TotalC,TotalL,TotalM,TotalP, Totaltotal;
    public void Matriz (int N1,int N2,int N3,int N4,int N5,int N6,
            int N7,int N8,int N9,int N10,int N11,
            int N12,int N13,int N14,int N15,int N16){ 
    
    LuisC = N1; 
    LuisL = N2; 
    LuisM = N3; 
    LuisP = N4; 
    PedroC = N5;
    PedroL = N6;
    PedroM = N7;
    PedroP = N8;
    JoseC = N9;
    JoseL= N10;
    JoseM = N11;
    JoseP = N12;
    AnaC = N13;
    AnaL = N14;
    AnaM = N15;
    AnaP = N16;
    TotalLuis = (LuisC+LuisL+LuisM+LuisP);
    TotalPedro = (PedroC+PedroL+PedroM+PedroP);
    TotalJose = (JoseC+JoseL+JoseM+JoseP);
    TotalAna = (AnaC+AnaL+AnaM+AnaP);
    TotalC = (LuisC+PedroC+JoseC+AnaC);
    TotalL = (LuisL+PedroL+JoseL+AnaL);
    TotalM = (LuisM+PedroM+JoseM+AnaM);
    TotalP = (LuisP+PedroP+JoseP+AnaP);
    Totaltotal = (TotalC+TotalL+TotalM+TotalP);
   
}
}
    
