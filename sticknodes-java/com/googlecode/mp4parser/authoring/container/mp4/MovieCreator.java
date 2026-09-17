package com.googlecode.mp4parser.authoring.container.mp4;

/* loaded from: classes2.dex */
public class MovieCreator {
    public MovieCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.googlecode.mp4parser.authoring.Movie build(com.googlecode.mp4parser.DataSource r11) throws java.io.IOException {
            com.coremedia.iso.IsoFile r0 = new com.coremedia.iso.IsoFile
            r0.<init>(r11)
            com.googlecode.mp4parser.authoring.Movie r1 = new com.googlecode.mp4parser.authoring.Movie
            r1.<init>()
            com.coremedia.iso.boxes.MovieBox r2 = r0.getMovieBox()
            java.lang.Class<com.coremedia.iso.boxes.TrackBox> r3 = com.coremedia.iso.boxes.TrackBox.class
            java.util.List r2 = r2.getBoxes(r3)
            java.util.Iterator r2 = r2.iterator()
        L18:
            boolean r3 = r2.hasNext()
            if (r3 != 0) goto L2e
            com.coremedia.iso.boxes.MovieBox r11 = r0.getMovieBox()
            com.coremedia.iso.boxes.MovieHeaderBox r11 = r11.getMovieHeaderBox()
            com.googlecode.mp4parser.util.Matrix r11 = r11.getMatrix()
            r1.setMatrix(r11)
            return r1
        L2e:
            java.lang.Object r3 = r2.next()
            com.coremedia.iso.boxes.TrackBox r3 = (com.coremedia.iso.boxes.TrackBox) r3
            java.lang.String r4 = "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schm[0]"
            com.coremedia.iso.boxes.Box r4 = com.googlecode.mp4parser.util.Path.getPath(r3, r4)
            com.coremedia.iso.boxes.SchemeTypeBox r4 = (com.coremedia.iso.boxes.SchemeTypeBox) r4
            r5 = 0
            java.lang.String r6 = "]"
            java.lang.String r7 = "["
            if (r4 == 0) goto L88
            java.lang.String r8 = r4.getSchemeType()
            java.lang.String r9 = "cenc"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L5b
            java.lang.String r4 = r4.getSchemeType()
            java.lang.String r8 = "cbc1"
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L88
        L5b:
            com.googlecode.mp4parser.authoring.CencMp4TrackImplImpl r4 = new com.googlecode.mp4parser.authoring.CencMp4TrackImplImpl
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = r11.toString()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r8.<init>(r9)
            r8.append(r7)
            com.coremedia.iso.boxes.TrackHeaderBox r7 = r3.getTrackHeaderBox()
            long r9 = r7.getTrackId()
            r8.append(r9)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.coremedia.iso.IsoFile[] r5 = new com.coremedia.iso.IsoFile[r5]
            r4.<init>(r6, r3, r5)
            r1.addTrack(r4)
            goto L18
        L88:
            com.googlecode.mp4parser.authoring.Mp4TrackImpl r4 = new com.googlecode.mp4parser.authoring.Mp4TrackImpl
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = r11.toString()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r8.<init>(r9)
            r8.append(r7)
            com.coremedia.iso.boxes.TrackHeaderBox r7 = r3.getTrackHeaderBox()
            long r9 = r7.getTrackId()
            r8.append(r9)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.coremedia.iso.IsoFile[] r5 = new com.coremedia.iso.IsoFile[r5]
            r4.<init>(r6, r3, r5)
            r1.addTrack(r4)
            goto L18
    }

    public static com.googlecode.mp4parser.authoring.Movie build(java.lang.String r2) throws java.io.IOException {
            com.googlecode.mp4parser.FileDataSourceImpl r0 = new com.googlecode.mp4parser.FileDataSourceImpl
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
            r0.<init>(r1)
            com.googlecode.mp4parser.authoring.Movie r2 = build(r0)
            return r2
    }
}
