package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Phonetic{
    @JsonProperty("text")
    public String getText() {
        return this.text; }
    public void setText(String text) {
        this.text = text; }
    String text;
    @JsonProperty("audio")
    public String getAudio() {
        return this.audio; }
    public void setAudio(String audio) {
        this.audio = audio; }
    String audio;
    @JsonProperty("sourceUrl")
    public String getSourceUrl() {
        return this.sourceUrl; }
    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl; }
    String sourceUrl;
    @JsonProperty("license")
    public License getLicense() {
        return this.license; }
    public void setLicense(License license) {
        this.license = license; }
    License license;
}
