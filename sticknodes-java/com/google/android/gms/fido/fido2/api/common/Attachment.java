package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public enum Attachment extends java.lang.Enum<com.google.android.gms.fido.fido2.api.common.Attachment> implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.Attachment> CREATOR = null;
    public static final com.google.android.gms.fido.fido2.api.common.Attachment CROSS_PLATFORM = null;
    public static final com.google.android.gms.fido.fido2.api.common.Attachment PLATFORM = null;
    private static final /* synthetic */ com.google.android.gms.fido.fido2.api.common.Attachment[] zza = null;
    private final java.lang.String zzb;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static class UnsupportedAttachmentException extends java.lang.Exception {
        public UnsupportedAttachmentException(java.lang.String r3) {
                r2 = this;
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                r0[r1] = r3
                java.lang.String r3 = "Attachment %s not supported"
                java.lang.String r3 = java.lang.String.format(r3, r0)
                r2.<init>(r3)
                return
        }
    }

    static {
            com.google.android.gms.fido.fido2.api.common.Attachment r0 = new com.google.android.gms.fido.fido2.api.common.Attachment
            java.lang.String r1 = "PLATFORM"
            r2 = 0
            java.lang.String r3 = "platform"
            r0.<init>(r1, r2, r3)
            com.google.android.gms.fido.fido2.api.common.Attachment.PLATFORM = r0
            com.google.android.gms.fido.fido2.api.common.Attachment r1 = new com.google.android.gms.fido.fido2.api.common.Attachment
            java.lang.String r3 = "CROSS_PLATFORM"
            r4 = 1
            java.lang.String r5 = "cross-platform"
            r1.<init>(r3, r4, r5)
            com.google.android.gms.fido.fido2.api.common.Attachment.CROSS_PLATFORM = r1
            r3 = 2
            com.google.android.gms.fido.fido2.api.common.Attachment[] r3 = new com.google.android.gms.fido.fido2.api.common.Attachment[r3]
            r3[r2] = r0
            r3[r4] = r1
            com.google.android.gms.fido.fido2.api.common.Attachment.zza = r3
            com.google.android.gms.fido.fido2.api.common.zza r0 = new com.google.android.gms.fido.fido2.api.common.zza
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.Attachment.CREATOR = r0
            return
    }

    Attachment(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzb = r3
            return
    }

    public static com.google.android.gms.fido.fido2.api.common.Attachment fromString(java.lang.String r5) throws com.google.android.gms.fido.fido2.api.common.Attachment.UnsupportedAttachmentException {
            com.google.android.gms.fido.fido2.api.common.Attachment[] r0 = values()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L16
            r3 = r0[r2]
            java.lang.String r4 = r3.zzb
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L13
            return r3
        L13:
            int r2 = r2 + 1
            goto L6
        L16:
            com.google.android.gms.fido.fido2.api.common.Attachment$UnsupportedAttachmentException r0 = new com.google.android.gms.fido.fido2.api.common.Attachment$UnsupportedAttachmentException
            r0.<init>(r5)
            throw r0
    }

    public static com.google.android.gms.fido.fido2.api.common.Attachment valueOf(java.lang.String r1) {
            java.lang.Class<com.google.android.gms.fido.fido2.api.common.Attachment> r0 = com.google.android.gms.fido.fido2.api.common.Attachment.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.android.gms.fido.fido2.api.common.Attachment r1 = (com.google.android.gms.fido.fido2.api.common.Attachment) r1
            return r1
    }

    public static com.google.android.gms.fido.fido2.api.common.Attachment[] values() {
            com.google.android.gms.fido.fido2.api.common.Attachment[] r0 = com.google.android.gms.fido.fido2.api.common.Attachment.zza
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.fido.fido2.api.common.Attachment[] r0 = (com.google.android.gms.fido.fido2.api.common.Attachment[]) r0
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.zzb
            r1.writeString(r2)
            return
    }
}
