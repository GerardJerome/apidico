package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Root{
    @JsonProperty("word")
    public String getWord() {
        return this.word; }
    public void setWord(String word) {
        this.word = word; }
    String word;
    @JsonProperty("phonetic")
    public String getPhonetic() {
        return this.phonetic; }
    public void setPhonetic(String phonetic) {
        this.phonetic = phonetic; }
    String phonetic;
    @JsonProperty("phonetics")
    public ArrayList<Phonetic> getPhonetics() {
        return this.phonetics; }
    public void setPhonetics(ArrayList<Phonetic> phonetics) {
        this.phonetics = phonetics; }
    ArrayList<Phonetic> phonetics;
    @JsonProperty("meanings")
    public ArrayList<Meaning> getMeanings() {
        return this.meanings; }
    public void setMeanings(ArrayList<Meaning> meanings) {
        this.meanings = meanings; }
    ArrayList<Meaning> meanings;
    @JsonProperty("license")
    public License getLicense() {
        return this.license; }
    public void setLicense(License license) {
        this.license = license; }
    License license;
    @JsonProperty("sourceUrls")
    public ArrayList<String> getSourceUrls() {
        return this.sourceUrls; }
    public void setSourceUrls(ArrayList<String> sourceUrls) {
        this.sourceUrls = sourceUrls; }
    ArrayList<String> sourceUrls;
}
