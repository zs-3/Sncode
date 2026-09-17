package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "AuthenticationExtensionsClientOutputsCreator")
/* loaded from: classes.dex */
public class AuthenticationExtensionsClientOutputs extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getUvmEntries", id = 1)
    private final com.google.android.gms.fido.fido2.api.common.UvmEntries zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDevicePubKey", id = 2)
    private final com.google.android.gms.fido.fido2.api.common.zzf zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCredProps", id = 3)
    private final com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPrf", id = 4)
    private final com.google.android.gms.fido.fido2.api.common.zzh zzd;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static final class Builder {
        private com.google.android.gms.fido.fido2.api.common.UvmEntries zza;
        private com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs zzb;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs build() {
                r4 = this;
                com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs r0 = new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs
                com.google.android.gms.fido.fido2.api.common.UvmEntries r1 = r4.zza
                com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs r2 = r4.zzb
                r3 = 0
                r0.<init>(r1, r3, r2, r3)
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs.Builder setCredProps(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs r1) {
                r0 = this;
                r0.zzb = r1
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs.Builder setUserVerificationMethodEntries(com.google.android.gms.fido.fido2.api.common.UvmEntries r1) {
                r0 = this;
                r0.zza = r1
                return r0
        }
    }

    static {
            com.google.android.gms.fido.fido2.api.common.zzc r0 = new com.google.android.gms.fido.fido2.api.common.zzc
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    AuthenticationExtensionsClientOutputs(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) com.google.android.gms.fido.fido2.api.common.UvmEntries r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.fido.fido2.api.common.zzf r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) com.google.android.gms.fido.fido2.api.common.zzh r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    public static com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs deserializeFromBytes(byte[] r1) {
            android.os.Parcelable$Creator<com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs> r0 = com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs.CREATOR
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(r1, r0)
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs r1 = (com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs) r1
            return r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs r4 = (com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs) r4
            com.google.android.gms.fido.fido2.api.common.UvmEntries r0 = r3.zza
            com.google.android.gms.fido.fido2.api.common.UvmEntries r2 = r4.zza
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L32
            com.google.android.gms.fido.fido2.api.common.zzf r0 = r3.zzb
            com.google.android.gms.fido.fido2.api.common.zzf r2 = r4.zzb
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L32
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs r0 = r3.zzc
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs r2 = r4.zzc
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L32
            com.google.android.gms.fido.fido2.api.common.zzh r0 = r3.zzd
            com.google.android.gms.fido.fido2.api.common.zzh r4 = r4.zzd
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r0, r4)
            if (r4 == 0) goto L32
            r4 = 1
            return r4
        L32:
            return r1
    }

    public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs getCredProps() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs r0 = r1.zzc
            return r0
    }

    public com.google.android.gms.fido.fido2.api.common.UvmEntries getUvmEntries() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.UvmEntries r0 = r1.zza
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.gms.fido.fido2.api.common.UvmEntries r1 = r3.zza
            r2 = 0
            r0[r2] = r1
            com.google.android.gms.fido.fido2.api.common.zzf r1 = r3.zzb
            r2 = 1
            r0[r2] = r1
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs r1 = r3.zzc
            r2 = 2
            r0[r2] = r1
            com.google.android.gms.fido.fido2.api.common.zzh r1 = r3.zzd
            r2 = 3
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
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.fido.fido2.api.common.UvmEntries r1 = r4.getUvmEntries()
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.fido.fido2.api.common.zzf r1 = r4.zzb
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs r1 = r4.getCredProps()
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.fido.fido2.api.common.zzh r1 = r4.zzd
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
