package androidx.webkit;

/* loaded from: classes.dex */
public class WebMessageCompat {
    private final byte[] mArrayBuffer;
    private final androidx.webkit.WebMessagePortCompat[] mPorts;
    private final java.lang.String mString;
    private final int mType;

    public WebMessageCompat(java.lang.String r1, androidx.webkit.WebMessagePortCompat[] r2) {
            r0 = this;
            r0.<init>()
            r0.mString = r1
            r1 = 0
            r0.mArrayBuffer = r1
            r0.mPorts = r2
            r1 = 0
            r0.mType = r1
            return
    }

    public WebMessageCompat(byte[] r1, androidx.webkit.WebMessagePortCompat[] r2) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.mArrayBuffer = r1
            r1 = 0
            r0.mString = r1
            r0.mPorts = r2
            r1 = 1
            r0.mType = r1
            return
    }

    private void checkType(int r4) {
            r3 = this;
            int r0 = r3.mType
            if (r4 != r0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Wrong data accessor type detected. "
            r1.append(r2)
            int r2 = r3.mType
            java.lang.String r2 = r3.typeToString(r2)
            r1.append(r2)
            java.lang.String r2 = " expected, but got "
            r1.append(r2)
            java.lang.String r4 = r3.typeToString(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private java.lang.String typeToString(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            r0 = 1
            if (r2 == r0) goto L8
            java.lang.String r2 = "Unknown"
            return r2
        L8:
            java.lang.String r2 = "ArrayBuffer"
            return r2
        Lb:
            java.lang.String r2 = "String"
            return r2
    }

    public java.lang.String getData() {
            r1 = this;
            r0 = 0
            r1.checkType(r0)
            java.lang.String r0 = r1.mString
            return r0
    }
}
