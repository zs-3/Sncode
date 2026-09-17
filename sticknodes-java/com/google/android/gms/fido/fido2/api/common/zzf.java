package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "AuthenticationExtensionsDevicePublicKeyOutputsCreator")
/* loaded from: classes.dex */
public final class zzf extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.zzf> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getSignature", id = 1)
    private final byte[] zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAuthenticatorOutput", id = 2)
    private final byte[] zzb;

    static {
            com.google.android.gms.fido.fido2.api.common.zzg r0 = new com.google.android.gms.fido.fido2.api.common.zzg
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.zzf.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzf(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) byte[] r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) byte[] r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.fido.fido2.api.common.zzf
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.fido.fido2.api.common.zzf r4 = (com.google.android.gms.fido.fido2.api.common.zzf) r4
            byte[] r0 = r3.zza
            byte[] r2 = r4.zza
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L1e
            byte[] r0 = r3.zzb
            byte[] r4 = r4.zzb
            boolean r4 = java.util.Arrays.equals(r0, r4)
            if (r4 == 0) goto L1e
            r4 = 1
            return r4
        L1e:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            byte[] r1 = r3.zza
            r2 = 0
            r0[r2] = r1
            byte[] r1 = r3.zzb
            r2 = 1
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            byte[] r0 = r3.zza
            r1 = 1
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r4, r1, r0, r2)
            byte[] r0 = r3.zzb
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
