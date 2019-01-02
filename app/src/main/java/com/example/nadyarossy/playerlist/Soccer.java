package com.example.nadyarossy.playerlist;

import org.json.JSONObject;

public class Soccer {
    public String getIdP() {
        return idP;
    }

    public void setIdP(String idP) {
        this.idP = idP;
    }

    public String getIdT() {
        return idT;
    }

    public void setIdT(String idT) {
        this.idT = idT;
    }

    public String getIdS() {
        return idS;
    }

    public void setIdS(String idS) {
        this.idS = idS;
    }

    public String getIdPM() {
        return idPM;
    }

    public void setIdPM(String idPM) {
        this.idPM = idPM;
    }

    public String getKebangsaan() {
        return kebangsaan;
    }

    public void setKebangsaan(String kebangsaan) {
        this.kebangsaan = kebangsaan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getSigned() {
        return signed;
    }

    public void setSigned(String signed) {
        this.signed = signed;
    }

    public String getSigning() {
        return signing;
    }

    public void setSigning(String signing) {
        this.signing = signing;
    }

    public String getBayaran() {
        return bayaran;
    }

    public void setBayaran(String bayaran) {
        this.bayaran = bayaran;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public String getTinggi() {
        return tinggi;
    }

    public void setTinggi(String tinggi) {
        this.tinggi = tinggi;
    }

    public String getBerat() {
        return berat;
    }

    public void setBerat(String berat) {
        this.berat = berat;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getCutout() {
        return cutout;
    }

    public void setCutout(String cutout) {
        this.cutout = cutout;
    }

    public String getFanart1() {
        return fanart1;
    }

    public void setFanart1(String fanart1) {
        this.fanart1 = fanart1;
    }

    public String getFanart2() {
        return fanart2;
    }

    public void setFanart2(String fanart2) {
        this.fanart2 = fanart2;
    }

    public String getFanart3() {
        return fanart3;
    }

    public void setFanart3(String fanart3) {
        this.fanart3 = fanart3;
    }

    public String getFanart4() {
        return fanart4;
    }

    public void setFanart4(String fanart4) {
        this.fanart4 = fanart4;
    }

    private String idP = "idp";
    private String idT = "idT";
    private String idS = "idS";
    private String idPM = "idPM";
    private String kebangsaan = "kebangsaan";
    private String nama = "nama";
    private String team = "team";
    private String teamId = "teamId";
    private String born = "born";
    private String signed = "signed";
    private String signing = "signing";
    private String bayaran = "bayaran";
    private String ttl = "ttl";
    private String deskripsi = "deskripsi";
    private String gender = "gender";
    private String posisi = "posisi";
    private String tinggi = "tinggi";
    private String berat = "berat";
    private String thumb = "thumb";
    private String cutout = "cutout";
    private String fanart1 = "fanart1";
    private String fanart2 = "fanart2";
    private String fanart3 = "fanart3";
    private String fanart4 = "fanart4";

    Soccer(JSONObject obj){
        try {
            String idPlayer = obj.getString("idPlayer");
            String idTeam = obj.getString("idTeam");
            String idSoccerXML = obj.getString("idSoccerXML");
            String idPlayerManager = obj.getString("idPlayerManager");
            String strNationality = obj.getString("strNationality");
            String strPlayer = obj.getString("strPlayer");
            String strTeam = obj.getString("strTeam");
            String intSoccerXMLTeamID = obj.getString("intSoccerXMLTeamID");
            String dateBorn = obj.getString("dateBorn");
            String dateSigned = obj.getString("dateSigned");
            String strSigning = obj.getString("strSigning");
            String strWage = obj.getString("strWage");
            String strBirthLocation = obj.getString("strBirthLocation");
            String strDescriptionEN = obj.getString("strDescriptionEN");
            String strGender = obj.getString("strGender");
            String strPosition = obj.getString("strPosition");
            String strHeight = obj.getString("strHeight");
            String strWeight = obj.getString("strWeight");
            String strThumb = obj.getString("strThumb");
            String strCutout = obj.getString("strCutout");
            String strFanart1 = obj.getString("strFanart1");
            String strFanart2 = obj.getString("strFanart2");
            String strFanart3 = obj.getString("strFanart3");
            String strFanart4 = obj.getString("strFanart4");

            this.idP = idPlayer;
            this.idT = idTeam;
            this.idS = idSoccerXML;
            this.idPM = idPlayerManager;
            this.kebangsaan = strNationality;
            this.nama = strPlayer;
            this.team = strTeam;
            this.teamId = intSoccerXMLTeamID;
            this.born = dateBorn;
            this.signed = dateSigned;
            this.signing = strSigning;
            this.bayaran = strWage;
            this.ttl = strBirthLocation;
            this.deskripsi = strDescriptionEN;
            this.gender = strGender;
            this.posisi = strPosition;
            this.tinggi = strHeight;
            this.berat = strWeight;
            this.thumb = strThumb;
            this.cutout = strCutout;
            this.fanart1 = strFanart1;
            this.fanart2 = strFanart2;
            this.fanart3 = strFanart3;
            this.fanart4 = strFanart4;
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
