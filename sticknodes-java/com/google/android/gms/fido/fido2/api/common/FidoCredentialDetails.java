package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "FidoCredentialDetailsCreator")
/* loaded from: classes.dex */
public class FidoCredentialDetails extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getUserName", id = 1)
    private final java.lang.String zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getUserDisplayName", id = 2)
    private final java.lang.String zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getUserId", id = 3)
    private final byte[] zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCredentialId", id = 4)
    private final byte[] zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getIsDiscoverable", id = 5)
    private final boolean zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getIsPaymentCredential", id = 6)
    private final boolean zzf;

    static {
            com.google.android.gms.fido.fido2.api.common.zzy r0 = new com.google.android.gms.fido.fido2.api.common.zzy
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    FidoCredentialDetails(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) byte[] r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) byte[] r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) boolean r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) boolean r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            return
    }

    public static com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails deserializeFromBytes(byte[] r1) {
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails> r0 = com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails.CREATOR
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(r1, r0)
            com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails r1 = (com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails) r1
            return r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails r4 = (com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails) r4
            java.lang.String r0 = r3.zza
            java.lang.String r2 = r4.zza
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L3e
            java.lang.String r0 = r3.zzb
            java.lang.String r2 = r4.zzb
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L3e
            byte[] r0 = r3.zzc
            byte[] r2 = r4.zzc
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L3e
            byte[] r0 = r3.zzd
            byte[] r2 = r4.zzd
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L3e
            boolean r0 = r3.zze
            boolean r2 = r4.zze
            if (r0 != r2) goto L3e
            boolean r0 = r3.zzf
            boolean r4 = r4.zzf
            if (r0 != r4) goto L3e
            r4 = 1
            return r4
        L3e:
            return r1
    }

    public byte[] getCredentialId() {
            r1 = this;
            byte[] r0 = r1.zzd
            return r0
    }

    public boolean getIsDiscoverable() {
            r1 = this;
            boolean r0 = r1.zze
            return r0
    }

    public boolean getIsPaymentCredential() {
            r1 = this;
            boolean r0 = r1.zzf
            return r0
    }

    public java.lang.String getUserDisplayName() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    public byte[] getUserId() {
            r1 = this;
            byte[] r0 = r1.zzc
            return r0
    }

    public java.lang.String getUserName() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 6
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.zza
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.zzb
            r2 = 1
            r0[r2] = r1
            byte[] r1 = r3.zzc
            r2 = 2
            r0[r2] = r1
            byte[] r1 = r3.zzd
            r2 = 3
            r0[r2] = r1
            boolean r1 = r3.zze
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 4
            r0[r2] = r1
            boolean r1 = r3.zzf
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 5
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    public byte[] serializeToBytes() {
            r1 = this;
            byte[] r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.lang.String r0 = r3.getUserName()
            r1 = 1
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            java.lang.String r0 = r3.getUserDisplayName()
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            byte[] r0 = r3.getUserId()
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r4, r1, r0, r2)
            byte[] r0 = r3.getCredentialId()
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r4, r1, r0, r2)
            boolean r0 = r3.getIsDiscoverable()
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r0)
            boolean r0 = r3.getIsPaymentCredential()
            r1 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
