package com.googlecode.mp4parser.authoring;

/* loaded from: classes2.dex */
public class TrackMetaData implements java.lang.Cloneable {
    private java.util.Date creationTime;
    private int group;
    private double height;
    private java.lang.String language;
    int layer;
    private com.googlecode.mp4parser.util.Matrix matrix;
    private java.util.Date modificationTime;
    private long timescale;
    private long trackId;
    private float volume;
    private double width;

    public TrackMetaData() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "eng"
            r2.language = r0
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            r2.modificationTime = r0
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            r2.creationTime = r0
            com.googlecode.mp4parser.util.Matrix r0 = com.googlecode.mp4parser.util.Matrix.ROTATE_0
            r2.matrix = r0
            r0 = 1
            r2.trackId = r0
            r0 = 0
            r2.group = r0
            return
    }

    public java.lang.Object clone() {
            r1 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    public java.util.Date getCreationTime() {
            r1 = this;
            java.util.Date r0 = r1.creationTime
            return r0
    }

    public int getGroup() {
            r1 = this;
            int r0 = r1.group
            return r0
    }

    public double getHeight() {
            r2 = this;
            double r0 = r2.height
            return r0
    }

    public java.lang.String getLanguage() {
            r1 = this;
            java.lang.String r0 = r1.language
            return r0
    }

    public int getLayer() {
            r1 = this;
            int r0 = r1.layer
            return r0
    }

    public com.googlecode.mp4parser.util.Matrix getMatrix() {
            r1 = this;
            com.googlecode.mp4parser.util.Matrix r0 = r1.matrix
            return r0
    }

    public java.util.Date getModificationTime() {
            r1 = this;
            java.util.Date r0 = r1.modificationTime
            return r0
    }

    public long getTimescale() {
            r2 = this;
            long r0 = r2.timescale
            return r0
    }

    public long getTrackId() {
            r2 = this;
            long r0 = r2.trackId
            return r0
    }

    public float getVolume() {
            r1 = this;
            float r0 = r1.volume
            return r0
    }

    public double getWidth() {
            r2 = this;
            double r0 = r2.width
            return r0
    }

    public void setCreationTime(java.util.Date r1) {
            r0 = this;
            r0.creationTime = r1
            return
    }

    public void setGroup(int r1) {
            r0 = this;
            r0.group = r1
            return
    }

    public void setHeight(double r1) {
            r0 = this;
            r0.height = r1
            return
    }

    public void setLanguage(java.lang.String r1) {
            r0 = this;
            r0.language = r1
            return
    }

    public void setLayer(int r1) {
            r0 = this;
            r0.layer = r1
            return
    }

    public void setMatrix(com.googlecode.mp4parser.util.Matrix r1) {
            r0 = this;
            r0.matrix = r1
            return
    }

    public void setModificationTime(java.util.Date r1) {
            r0 = this;
            r0.modificationTime = r1
            return
    }

    public void setTimescale(long r1) {
            r0 = this;
            r0.timescale = r1
            return
    }

    public void setTrackId(long r1) {
            r0 = this;
            r0.trackId = r1
            return
    }

    public void setVolume(float r1) {
            r0 = this;
            r0.volume = r1
            return
    }

    public void setWidth(double r1) {
            r0 = this;
            r0.width = r1
            return
    }
}
