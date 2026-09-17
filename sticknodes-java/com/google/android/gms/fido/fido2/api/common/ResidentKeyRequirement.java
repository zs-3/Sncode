package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public enum ResidentKeyRequirement extends java.lang.Enum<com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement> implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement> CREATOR = null;
    public static final com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement RESIDENT_KEY_DISCOURAGED = null;
    public static final com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement RESIDENT_KEY_PREFERRED = null;
    public static final com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement RESIDENT_KEY_REQUIRED = null;
    private static final /* synthetic */ com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement[] zza = null;
    private final java.lang.String zzb;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static class UnsupportedResidentKeyRequirementException extends java.lang.Exception {
        public UnsupportedResidentKeyRequirementException(java.lang.String r3) {
                r2 = this;
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                r0[r1] = r3
                java.lang.String r3 = "Resident key requirement %s not supported"
                java.lang.String r3 = java.lang.String.format(r3, r0)
                r2.<init>(r3)
                return
        }
    }

    static {
            com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement r0 = new com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement
            java.lang.String r1 = "RESIDENT_KEY_DISCOURAGED"
            r2 = 0
            java.lang.String r3 = "discouraged"
            r0.<init>(r1, r2, r3)
            com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.RESIDENT_KEY_DISCOURAGED = r0
            com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement r1 = new com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement
            java.lang.String r3 = "RESIDENT_KEY_PREFERRED"
            r4 = 1
            java.lang.String r5 = "preferred"
            r1.<init>(r3, r4, r5)
            com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.RESIDENT_KEY_PREFERRED = r1
            com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement r3 = new com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement
            java.lang.String r5 = "RESIDENT_KEY_REQUIRED"
            r6 = 2
            java.lang.String r7 = "required"
            r3.<init>(r5, r6, r7)
            com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.RESIDENT_KEY_REQUIRED = r3
            r5 = 3
            com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement[] r5 = new com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.zza = r5
            com.google.android.gms.fido.fido2.api.common.zzas r0 = new com.google.android.gms.fido.fido2.api.common.zzas
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.CREATOR = r0
            return
    }

    ResidentKeyRequirement(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zzb = r3
            return
    }

    public static com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement fromString(java.lang.String r5) throws com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.UnsupportedResidentKeyRequirementException {
            com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement[] r0 = values()
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
            com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement$UnsupportedResidentKeyRequirementException r0 = new com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement$UnsupportedResidentKeyRequirementException
            r0.<init>(r5)
            throw r0
    }

    public static com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement valueOf(java.lang.String r1) {
            java.lang.Class<com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement> r0 = com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement r1 = (com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement) r1
            return r1
    }

    public static com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement[] values() {
            com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement[] r0 = com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.zza
            java.lang.Object r0 = r0.clone()
            com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement[] r0 = (com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement[]) r0
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
