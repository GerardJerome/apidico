package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Meaning{
    @JsonProperty("partOfSpeech")
    public String getPartOfSpeech() {
        return this.partOfSpeech; }
    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech; }
    String partOfSpeech;
    @JsonProperty("definitions")
    public ArrayList<Definition> getDefinitions() {
        return this.definitions; }
    public void setDefinitions(ArrayList<Definition> definitions) {
        this.definitions = definitions; }
    ArrayList<Definition> definitions;
    @JsonProperty("synonyms")
    public ArrayList<String> getSynonyms() {
        return this.synonyms; }
    public void setSynonyms(ArrayList<String> synonyms) {
        this.synonyms = synonyms; }
    ArrayList<String> synonyms;
    @JsonProperty("antonyms")
    public ArrayList<String> getAntonyms() {
        return this.antonyms; }
    public void setAntonyms(ArrayList<String> antonyms) {
        this.antonyms = antonyms; }
    ArrayList<String> antonyms;
}
