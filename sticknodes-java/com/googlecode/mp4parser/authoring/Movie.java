package com.googlecode.mp4parser.authoring;

/* loaded from: classes2.dex */
public class Movie {
    com.googlecode.mp4parser.util.Matrix matrix;
    java.util.List<com.googlecode.mp4parser.authoring.Track> tracks;

    public Movie() {
            r1 = this;
            r1.<init>()
            com.googlecode.mp4parser.util.Matrix r0 = com.googlecode.mp4parser.util.Matrix.ROTATE_0
            r1.matrix = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.tracks = r0
            return
    }

    public Movie(java.util.List<com.googlecode.mp4parser.authoring.Track> r2) {
            r1 = this;
            r1.<init>()
            com.googlecode.mp4parser.util.Matrix r0 = com.googlecode.mp4parser.util.Matrix.ROTATE_0
            r1.matrix = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.tracks = r2
            return
    }

    public static long gcd(long r3, long r5) {
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto L7
            return r3
        L7:
            long r3 = r3 % r5
            long r3 = gcd(r5, r3)
            return r3
    }

    public void addTrack(com.googlecode.mp4parser.authoring.Track r4) {
            r3 = this;
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r4.getTrackMetaData()
            long r0 = r0.getTrackId()
            com.googlecode.mp4parser.authoring.Track r0 = r3.getTrackByTrackId(r0)
            if (r0 == 0) goto L19
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r4.getTrackMetaData()
            long r1 = r3.getNextTrackId()
            r0.setTrackId(r1)
        L19:
            java.util.List<com.googlecode.mp4parser.authoring.Track> r0 = r3.tracks
            r0.add(r4)
            return
    }

    public com.googlecode.mp4parser.util.Matrix getMatrix() {
            r1 = this;
            com.googlecode.mp4parser.util.Matrix r0 = r1.matrix
            return r0
    }

    public long getNextTrackId() {
            r7 = this;
            java.util.List<com.googlecode.mp4parser.authoring.Track> r0 = r7.tracks
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L8:
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto L12
            r3 = 1
            long r1 = r1 + r3
            return r1
        L12:
            java.lang.Object r3 = r0.next()
            com.googlecode.mp4parser.authoring.Track r3 = (com.googlecode.mp4parser.authoring.Track) r3
            com.googlecode.mp4parser.authoring.TrackMetaData r4 = r3.getTrackMetaData()
            long r4 = r4.getTrackId()
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 >= 0) goto L8
            com.googlecode.mp4parser.authoring.TrackMetaData r1 = r3.getTrackMetaData()
            long r1 = r1.getTrackId()
            goto L8
    }

    public long getTimescale() {
            r5 = this;
            java.util.List r0 = r5.getTracks()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            com.googlecode.mp4parser.authoring.Track r0 = (com.googlecode.mp4parser.authoring.Track) r0
            com.googlecode.mp4parser.authoring.TrackMetaData r0 = r0.getTrackMetaData()
            long r0 = r0.getTimescale()
            java.util.List r2 = r5.getTracks()
            java.util.Iterator r2 = r2.iterator()
        L1e:
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L25
            return r0
        L25:
            java.lang.Object r3 = r2.next()
            com.googlecode.mp4parser.authoring.Track r3 = (com.googlecode.mp4parser.authoring.Track) r3
            com.googlecode.mp4parser.authoring.TrackMetaData r3 = r3.getTrackMetaData()
            long r3 = r3.getTimescale()
            long r0 = gcd(r3, r0)
            goto L1e
    }

    public com.googlecode.mp4parser.authoring.Track getTrackByTrackId(long r6) {
            r5 = this;
            java.util.List<com.googlecode.mp4parser.authoring.Track> r0 = r5.tracks
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto Le
            r6 = 0
            return r6
        Le:
            java.lang.Object r1 = r0.next()
            com.googlecode.mp4parser.authoring.Track r1 = (com.googlecode.mp4parser.authoring.Track) r1
            com.googlecode.mp4parser.authoring.TrackMetaData r2 = r1.getTrackMetaData()
            long r2 = r2.getTrackId()
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 != 0) goto L6
            return r1
    }

    public java.util.List<com.googlecode.mp4parser.authoring.Track> getTracks() {
            r1 = this;
            java.util.List<com.googlecode.mp4parser.authoring.Track> r0 = r1.tracks
            return r0
    }

    public void setMatrix(com.googlecode.mp4parser.util.Matrix r1) {
            r0 = this;
            r0.matrix = r1
            return
    }

    public void setTracks(java.util.List<com.googlecode.mp4parser.authoring.Track> r1) {
            r0 = this;
            r0.tracks = r1
            return
    }

    public java.lang.String toString() {
            r6 = this;
            java.util.List<com.googlecode.mp4parser.authoring.Track> r0 = r6.tracks
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "Movie{ "
        L8:
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L21:
            java.lang.Object r2 = r0.next()
            com.googlecode.mp4parser.authoring.Track r2 = (com.googlecode.mp4parser.authoring.Track) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.<init>(r1)
            java.lang.String r1 = "track_"
            r3.append(r1)
            com.googlecode.mp4parser.authoring.TrackMetaData r1 = r2.getTrackMetaData()
            long r4 = r1.getTrackId()
            r3.append(r4)
            java.lang.String r1 = " ("
            r3.append(r1)
            java.lang.String r1 = r2.getHandler()
            r3.append(r1)
            java.lang.String r1 = ") "
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            goto L8
    }
}
