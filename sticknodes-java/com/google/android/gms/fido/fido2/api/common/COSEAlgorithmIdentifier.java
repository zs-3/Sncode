package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public class COSEAlgorithmIdentifier implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier> CREATOR = null;
    private final com.google.android.gms.fido.fido2.api.common.Algorithm zza;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static class UnsupportedAlgorithmIdentifierException extends java.lang.Exception {
        public UnsupportedAlgorithmIdentifierException(int r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Algorithm with COSE value "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = " not supported"
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
        }
    }

    static {
            com.google.android.gms.fido.fido2.api.common.zzp r0 = new com.google.android.gms.fido.fido2.api.common.zzp
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier.CREATOR = r0
            return
    }

    COSEAlgorithmIdentifier(com.google.android.gms.fido.fido2.api.common.Algorithm r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.fido.fido2.api.common.Algorithm r1 = (com.google.android.gms.fido.fido2.api.common.Algorithm) r1
            r0.zza = r1
            return
    }

    public static com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier fromCoseValue(int r7) throws com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier.UnsupportedAlgorithmIdentifierException {
            com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier r0 = new com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier
            com.google.android.gms.fido.fido2.api.common.RSAAlgorithm r1 = com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.LEGACY_RS1
            int r1 = r1.getAlgoValue()
            if (r7 != r1) goto Ld
            com.google.android.gms.fido.fido2.api.common.RSAAlgorithm r7 = com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.RS1
            goto L33
        Ld:
            com.google.android.gms.fido.fido2.api.common.RSAAlgorithm[] r1 = com.google.android.gms.fido.fido2.api.common.RSAAlgorithm.values()
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L14:
            if (r4 >= r2) goto L23
            r5 = r1[r4]
            int r6 = r5.getAlgoValue()
            if (r6 != r7) goto L20
            r7 = r5
            goto L33
        L20:
            int r4 = r4 + 1
            goto L14
        L23:
            com.google.android.gms.fido.fido2.api.common.EC2Algorithm[] r1 = com.google.android.gms.fido.fido2.api.common.EC2Algorithm.values()
            int r2 = r1.length
        L28:
            if (r3 >= r2) goto L3a
            r4 = r1[r3]
            int r5 = r4.getAlgoValue()
            if (r5 != r7) goto L37
            r7 = r4
        L33:
            r0.<init>(r7)
            return r0
        L37:
            int r3 = r3 + 1
            goto L28
        L3a:
            com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException r0 = new com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier$UnsupportedAlgorithmIdentifierException
            r0.<init>(r7)
            throw r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier r3 = (com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier) r3
            com.google.android.gms.fido.fido2.api.common.Algorithm r0 = r2.zza
            int r0 = r0.getAlgoValue()
            com.google.android.gms.fido.fido2.api.common.Algorithm r3 = r3.zza
            int r3 = r3.getAlgoValue()
            if (r0 != r3) goto L18
            r3 = 1
            return r3
        L18:
            return r1
    }

    public int hashCode() {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.gms.fido.fido2.api.common.Algorithm r1 = r3.zza
            r2 = 0
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    public int toCoseValue() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.Algorithm r0 = r1.zza
            int r0 = r0.getAlgoValue()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            com.google.android.gms.fido.fido2.api.common.Algorithm r2 = r0.zza
            int r2 = r2.getAlgoValue()
            r1.writeInt(r2)
            return
    }
}
