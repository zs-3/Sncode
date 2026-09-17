package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "AuthenticationExtensionsCredPropsOutputsCreator")
/* loaded from: classes.dex */
public class AuthenticationExtensionsCredPropsOutputs extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getIsDiscoverableCredential", id = 1)
    private final boolean zza;

    static {
            com.google.android.gms.fido.fido2.api.common.zze r0 = new com.google.android.gms.fido.fido2.api.common.zze
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public AuthenticationExtensionsCredPropsOutputs(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) boolean r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs r3 = (com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs) r3
            boolean r0 = r2.zza
            boolean r3 = r3.zza
            if (r0 != r3) goto L10
            r3 = 1
            return r3
        L10:
            return r1
    }

    public boolean getIsDiscoverableCredential() {
            r1 = this;
            boolean r0 = r1.zza
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            boolean r1 = r3.zza
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            boolean r0 = r2.getIsDiscoverableCredential()
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r3, r1, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r4)
            return
    }
}
