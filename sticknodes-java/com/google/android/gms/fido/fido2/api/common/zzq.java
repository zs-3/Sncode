package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "CableAuthenticationDataCreator")
/* loaded from: classes.dex */
public final class zzq extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.zzq> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getVersion", id = 1)
    private final long zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getClientEid", id = 2)
    private final byte[] zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAuthenticatorEid", id = 3)
    private final byte[] zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getSessionPreKey", id = 4)
    private final byte[] zzd;

    static {
            com.google.android.gms.fido.fido2.api.common.zzr r0 = new com.google.android.gms.fido.fido2.api.common.zzr
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.zzq.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzq(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) long r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) byte[] r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) byte[] r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) byte[] r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            byte[] r1 = (byte[]) r1
            r0.zzb = r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            byte[] r1 = (byte[]) r1
            r0.zzc = r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            byte[] r1 = (byte[]) r1
            r0.zzd = r1
            return
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.gms.fido.fido2.api.common.zzq
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.fido.fido2.api.common.zzq r7 = (com.google.android.gms.fido.fido2.api.common.zzq) r7
            long r2 = r6.zza
            long r4 = r7.zza
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L30
            byte[] r0 = r6.zzb
            byte[] r2 = r7.zzb
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L30
            byte[] r0 = r6.zzc
            byte[] r2 = r7.zzc
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L30
            byte[] r0 = r6.zzd
            byte[] r7 = r7.zzd
            boolean r7 = java.util.Arrays.equals(r0, r7)
            if (r7 == 0) goto L30
            r7 = 1
            return r7
        L30:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            long r1 = r3.zza
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            byte[] r1 = r3.zzb
            r2 = 1
            r0[r2] = r1
            byte[] r1 = r3.zzc
            r2 = 2
            r0[r2] = r1
            byte[] r1 = r3.zzd
            r2 = 3
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            long r0 = r3.zza
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r2, r0)
            byte[] r0 = r3.zzb
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r4, r1, r0, r2)
            byte[] r0 = r3.zzc
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r4, r1, r0, r2)
            byte[] r0 = r3.zzd
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
