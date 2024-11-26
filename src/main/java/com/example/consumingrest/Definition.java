package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root[] root = om.readValue(myJsonString, Root[].class); */
public class Definition{
    @JsonProperty("definition")
    public String getDefinition() {
        return this.definition; }
    public void setDefinition(String definition) {
        this.definition = definition; }
    String definition;
    @JsonProperty("synonyms")
    public ArrayList<String> getSynonyms() {
        return this.synonyms; }
    public void setSynonyms(ArrayList<String> synonyms) {
        this.synonyms = synonyms; }
    ArrayList<String> synonyms;
    @JsonProperty("antonyms")
    public ArrayList<Object> getAntonyms() {
        return this.antonyms; }
    public void setAntonyms(ArrayList<Object> antonyms) {
        this.antonyms = antonyms; }
    ArrayList<Object> antonyms;
    @JsonProperty("example")
    public String getExample() {
        return this.example; }
    public void setExample(String example) {
        this.example = example; }
    String example;
}








