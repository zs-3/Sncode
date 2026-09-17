package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "DevicePublicKeyExtensionCreator")
/* loaded from: classes.dex */
public final class zzu extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.zzu> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDevicePublicKey", id = 1)
    private final boolean zza;

    static {
            com.google.android.gms.fido.fido2.api.common.zzv r0 = new com.google.android.gms.fido.fido2.api.common.zzv
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.zzu.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzu(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) boolean r1) {
            r0 = this;
            r0.<init>()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.zza = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.gms.fido.fido2.api.common.zzu
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.fido.fido2.api.common.zzu r3 = (com.google.android.gms.fido.fido2.api.common.zzu) r3
            boolean r0 = r2.zza
            boolean r3 = r3.zza
            if (r0 != r3) goto L10
            r3 = 1
            return r3
        L10:
            return r1
    }

    public final int hashCode() {
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
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            boolean r0 = r2.zza
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r3, r1, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r4)
            return
    }
}
