package com.coremedia.iso;

@com.googlecode.mp4parser.annotations.DoNotParseDetail
/* loaded from: classes.dex */
public class IsoFile extends com.googlecode.mp4parser.BasicContainer {
    private static com.googlecode.mp4parser.util.Logger LOG;

    static {
            java.lang.Class<com.coremedia.iso.IsoFile> r0 = com.coremedia.iso.IsoFile.class
            com.googlecode.mp4parser.util.Logger r0 = com.googlecode.mp4parser.util.Logger.getLogger(r0)
            com.coremedia.iso.IsoFile.LOG = r0
            return
    }

    public IsoFile(com.googlecode.mp4parser.DataSource r3) throws java.io.IOException {
            r2 = this;
            com.coremedia.iso.PropertyBoxParserImpl r0 = new com.coremedia.iso.PropertyBoxParserImpl
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            r0.<init>(r1)
            r2.<init>(r3, r0)
            return
    }

    public IsoFile(com.googlecode.mp4parser.DataSource r3, com.coremedia.iso.BoxParser r4) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            long r0 = r3.size()
            r2.initContainer(r3, r0, r4)
            return
    }

    public IsoFile(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            com.googlecode.mp4parser.FileDataSourceImpl r0 = new com.googlecode.mp4parser.FileDataSourceImpl
            java.io.File r1 = new java.io.File
            r1.<init>(r3)
            r0.<init>(r1)
            r2.<init>(r0)
            return
    }

    public static java.lang.String bytesToFourCC(byte[] r3) {
            r0 = 4
            byte[] r1 = new byte[r0]
            if (r3 == 0) goto Le
            int r2 = r3.length
            int r0 = java.lang.Math.min(r2, r0)
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r1, r2, r0)
        Le:
            java.lang.String r3 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L16
            java.lang.String r0 = "ISO-8859-1"
            r3.<init>(r1, r0)     // Catch: java.io.UnsupportedEncodingException -> L16
            return r3
        L16:
            r3 = move-exception
            java.lang.Error r0 = new java.lang.Error
            java.lang.String r1 = "Required character encoding is missing"
            r0.<init>(r1, r3)
            throw r0
    }

    public static byte[] fourCCtoBytes(java.lang.String r4) {
            r0 = 4
            byte[] r1 = new byte[r0]
            if (r4 == 0) goto L1b
            r2 = 0
        L6:
            int r3 = r4.length()
            int r3 = java.lang.Math.min(r0, r3)
            if (r2 < r3) goto L11
            goto L1b
        L11:
            char r3 = r4.charAt(r2)
            byte r3 = (byte) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L6
        L1b:
            return r1
    }

    @Override // com.googlecode.mp4parser.BasicContainer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            com.googlecode.mp4parser.DataSource r0 = r1.dataSource
            r0.close()
            return
    }

    public void getBox(java.nio.channels.WritableByteChannel r1) throws java.io.IOException {
            r0 = this;
            r0.writeContainer(r1)
            return
    }

    public com.coremedia.iso.boxes.MovieBox getMovieBox() {
            r3 = this;
            java.util.List r0 = r3.getBoxes()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L10
            r0 = 0
            return r0
        L10:
            java.lang.Object r1 = r0.next()
            com.coremedia.iso.boxes.Box r1 = (com.coremedia.iso.boxes.Box) r1
            boolean r2 = r1 instanceof com.coremedia.iso.boxes.MovieBox
            if (r2 == 0) goto L8
            com.coremedia.iso.boxes.MovieBox r1 = (com.coremedia.iso.boxes.MovieBox) r1
            return r1
    }

    public long getSize() {
            r2 = this;
            long r0 = r2.getContainerSize()
            return r0
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "model("
            r0.<init>(r1)
            com.googlecode.mp4parser.DataSource r1 = r2.dataSource
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
