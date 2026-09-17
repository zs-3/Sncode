package com.coremedia.iso;

/* loaded from: classes.dex */
public class BoxReplacer {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    static {
            return
    }

    public BoxReplacer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void replace(java.util.Map<java.lang.String, com.coremedia.iso.boxes.Box> r7, java.io.File r8) throws java.io.IOException {
            com.coremedia.iso.IsoFile r0 = new com.coremedia.iso.IsoFile
            com.googlecode.mp4parser.FileDataSourceImpl r1 = new com.googlecode.mp4parser.FileDataSourceImpl
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile
            java.lang.String r3 = "r"
            r2.<init>(r8, r3)
            java.nio.channels.FileChannel r2 = r2.getChannel()
            r1.<init>(r2)
            r0.<init>(r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L27:
            boolean r3 = r7.hasNext()
            if (r3 != 0) goto L6a
            r0.close()
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile
            java.lang.String r0 = "rw"
            r7.<init>(r8, r0)
            java.nio.channels.FileChannel r3 = r7.getChannel()
            java.util.Set r7 = r1.keySet()
            java.util.Iterator r4 = r7.iterator()
        L43:
            boolean r7 = r4.hasNext()
            if (r7 != 0) goto L4d
            r3.close()
            return
        L4d:
            java.lang.Object r7 = r4.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r1.get(r7)
            com.coremedia.iso.boxes.Box r8 = (com.coremedia.iso.boxes.Box) r8
            java.lang.Object r7 = r2.get(r7)
            java.lang.Long r7 = (java.lang.Long) r7
            long r5 = r7.longValue()
            r3.position(r5)
            r8.getBox(r3)
            goto L43
        L6a:
            java.lang.Object r3 = r7.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            com.coremedia.iso.boxes.Box r4 = com.googlecode.mp4parser.util.Path.getPath(r0, r4)
            java.lang.String r5 = com.googlecode.mp4parser.util.Path.createPath(r4)
            java.lang.Object r3 = r3.getValue()
            com.coremedia.iso.boxes.Box r3 = (com.coremedia.iso.boxes.Box) r3
            r1.put(r5, r3)
            java.lang.String r3 = com.googlecode.mp4parser.util.Path.createPath(r4)
            long r4 = r4.getOffset()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2.put(r3, r4)
            goto L27
    }
}
