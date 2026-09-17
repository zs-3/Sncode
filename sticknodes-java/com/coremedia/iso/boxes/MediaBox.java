package com.coremedia.iso.boxes;

/* loaded from: classes.dex */
public class MediaBox extends com.googlecode.mp4parser.AbstractContainerBox {
    public static final java.lang.String TYPE = "mdia";

    public MediaBox() {
            r1 = this;
            java.lang.String r0 = "mdia"
            r1.<init>(r0)
            return
    }

    public com.coremedia.iso.boxes.HandlerBox getHandlerBox() {
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
            boolean r2 = r1 instanceof com.coremedia.iso.boxes.HandlerBox
            if (r2 == 0) goto L8
            com.coremedia.iso.boxes.HandlerBox r1 = (com.coremedia.iso.boxes.HandlerBox) r1
            return r1
    }

    public com.coremedia.iso.boxes.MediaHeaderBox getMediaHeaderBox() {
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
            boolean r2 = r1 instanceof com.coremedia.iso.boxes.MediaHeaderBox
            if (r2 == 0) goto L8
            com.coremedia.iso.boxes.MediaHeaderBox r1 = (com.coremedia.iso.boxes.MediaHeaderBox) r1
            return r1
    }

    public com.coremedia.iso.boxes.MediaInformationBox getMediaInformationBox() {
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
            boolean r2 = r1 instanceof com.coremedia.iso.boxes.MediaInformationBox
            if (r2 == 0) goto L8
            com.coremedia.iso.boxes.MediaInformationBox r1 = (com.coremedia.iso.boxes.MediaInformationBox) r1
            return r1
    }
}
