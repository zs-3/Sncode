package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "FidoAppIdExtensionCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public class FidoAppIdExtension extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAppId", id = 2)
    private final java.lang.String zza;

    static {
            com.google.android.gms.fido.fido2.api.common.zzx r0 = new com.google.android.gms.fido.fido2.api.common.zzx
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public FidoAppIdExtension(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.zza = r1
            return
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension r2 = (com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension) r2
            java.lang.String r0 = r1.zza
            java.lang.String r2 = r2.zza
            boolean r2 = r0.equals(r2)
            return r2
    }

    public java.lang.String getAppId() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.zza
            r2 = 0
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.lang.String r0 = r3.getAppId()
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
