package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "PublicKeyCredentialDescriptorCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public class PublicKeyCredentialDescriptor extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor> CREATOR = null;
    private static final com.google.android.gms.internal.fido.zzau zza = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTypeAsString", id = 2, type = "java.lang.String")
    private final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getId", id = 3)
    private final byte[] zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTransports", id = 4)
    private final java.util.List zzd;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static class UnsupportedPubKeyCredDescriptorException extends java.lang.Exception {
        public UnsupportedPubKeyCredDescriptorException(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public UnsupportedPubKeyCredDescriptorException(java.lang.String r1, java.lang.Throwable r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    static {
            com.google.android.gms.internal.fido.zzbj r0 = com.google.android.gms.internal.fido.zzh.zza
            com.google.android.gms.internal.fido.zzbj r1 = com.google.android.gms.internal.fido.zzh.zzb
            com.google.android.gms.internal.fido.zzau r0 = com.google.android.gms.internal.fido.zzau.zzi(r0, r1)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor.zza = r0
            com.google.android.gms.fido.fido2.api.common.zzam r0 = new com.google.android.gms.fido.fido2.api.common.zzam
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public PublicKeyCredentialDescriptor(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) byte[] r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.util.List<com.google.android.gms.fido.common.Transport> r3) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType r1 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.fromString(r1)     // Catch: com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException -> L17
            r0.zzb = r1     // Catch: com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException -> L17
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            byte[] r1 = (byte[]) r1
            r0.zzc = r1
            r0.zzd = r3
            return
        L17:
            r1 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            throw r2
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor r5 = (com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor) r5
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType r0 = r4.zzb
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType r2 = r5.zzb
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L13
            return r1
        L13:
            byte[] r0 = r4.zzc
            byte[] r2 = r5.zzc
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 != 0) goto L1e
            return r1
        L1e:
            java.util.List r0 = r4.zzd
            r2 = 1
            if (r0 != 0) goto L29
            java.util.List r3 = r5.zzd
            if (r3 == 0) goto L28
            goto L29
        L28:
            return r2
        L29:
            if (r0 == 0) goto L41
            java.util.List r3 = r5.zzd
            if (r3 != 0) goto L30
            goto L41
        L30:
            boolean r0 = r0.containsAll(r3)
            if (r0 == 0) goto L41
            java.util.List r5 = r5.zzd
            java.util.List r0 = r4.zzd
            boolean r5 = r5.containsAll(r0)
            if (r5 == 0) goto L41
            return r2
        L41:
            return r1
    }

    public byte[] getId() {
            r1 = this;
            byte[] r0 = r1.zzc
            return r0
    }

    public java.util.List<com.google.android.gms.fido.common.Transport> getTransports() {
            r1 = this;
            java.util.List r0 = r1.zzd
            return r0
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType getType() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType r0 = r1.zzb
            return r0
    }

    public java.lang.String getTypeAsString() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType r0 = r1.zzb
            java.lang.String r0 = r0.toString()
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType r1 = r3.zzb
            r2 = 0
            r0[r2] = r1
            byte[] r1 = r3.zzc
            int r1 = java.util.Arrays.hashCode(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            java.util.List r1 = r3.zzd
            r2 = 2
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.lang.String r0 = r3.getTypeAsString()
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            byte[] r0 = r3.getId()
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r4, r1, r0, r2)
            java.util.List r0 = r3.getTransports()
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
