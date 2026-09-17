package org.apache.commons.lang3.text.translate;

@java.lang.Deprecated
/* loaded from: classes2.dex */
public class UnicodeUnpairedSurrogateRemover extends org.apache.commons.lang3.text.translate.CodePointTranslator {
    public UnicodeUnpairedSurrogateRemover() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.apache.commons.lang3.text.translate.CodePointTranslator
    public boolean translate(int r1, java.io.Writer r2) throws java.io.IOException {
            r0 = this;
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r2) goto Lc
            r2 = 57343(0xdfff, float:8.0355E-41)
            if (r1 > r2) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }
}
