package org.jcodec.codecs.h264.io.model;

/* loaded from: classes2.dex */
public class RefPicMarkingIDR {
    boolean discardDecodedPics;
    boolean useForlongTerm;

    public RefPicMarkingIDR(boolean r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.discardDecodedPics = r1
            r0.useForlongTerm = r2
            return
    }

    public boolean isDiscardDecodedPics() {
            r1 = this;
            boolean r0 = r1.discardDecodedPics
            return r0
    }

    public boolean isUseForlongTerm() {
            r1 = this;
            boolean r0 = r1.useForlongTerm
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = org.jcodec.common.tools.ToJSON.toJSON(r1)
            return r0
    }
}
