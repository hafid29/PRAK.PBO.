/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterFacelatihan;

/**
 *
 * @author Hafid
 */
public class Program21941723009Hafid {
    public static void main(String[] args) {
        Rektor1941723009Hafid pakRektor = new Rektor1941723009Hafid();
        
//        Mahasiswa1941723009Hafid mahasiswaBiasa = new Mahasiswa1941723009Hafid("charlie");
        Sarjana1941723009Hafid sarjanaCumlaude = new Sarjana1941723009Hafid("Dini");
        PascaSarjana1941723009Hafid masterCumlaude = new PascaSarjana1941723009Hafid("Elok");
        
//        pakRektor.beriSertifikatCumlaudeHafid(mahasiswaBiasa);
//        pakRektor.beriSertifikatCumlaudeHafid(sarjanaCumlaude);
//        pakRektor.beriSertifikatCumlaudeHafid(masterCumlaude);
        
        pakRektor.beriSertifikatMawapress(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapress(masterCumlaude);
    }
}

