package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "UvmEntryCreator")
/* loaded from: classes.dex */
public class UvmEntry extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.UvmEntry> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getUserVerificationMethod", id = 1)
    private final int zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getKeyProtectionType", id = 2)
    private final short zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getMatcherProtectionType", id = 3)
    private final short zzc;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static final class Builder {
        private int zza;
        private short zzb;
        private short zzc;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.android.gms.fido.fido2.api.common.UvmEntry build() {
                r4 = this;
                com.google.android.gms.fido.fido2.api.common.UvmEntry r0 = new com.google.android.gms.fido.fido2.api.common.UvmEntry
                int r1 = r4.zza
                short r2 = r4.zzb
                short r3 = r4.zzc
                r0.<init>(r1, r2, r3)
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.UvmEntry.Builder setKeyProtectionType(short r1) {
                r0 = this;
                r0.zzb = r1
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.UvmEntry.Builder setMatcherProtectionType(short r1) {
                r0 = this;
                r0.zzc = r1
                return r0
        }

        public com.google.android.gms.fido.fido2.api.common.UvmEntry.Builder setUserVerificationMethod(int r1) {
                r0 = this;
                r0.zza = r1
                return r0
        }
    }

    static {
            com.google.android.gms.fido.fido2.api.common.zzba r0 = new com.google.android.gms.fido.fido2.api.common.zzba
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.UvmEntry.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    UvmEntry(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) short r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) short r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.fido.fido2.api.common.UvmEntry
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.fido.fido2.api.common.UvmEntry r4 = (com.google.android.gms.fido.fido2.api.common.UvmEntry) r4
            int r0 = r3.zza
            int r2 = r4.zza
            if (r0 != r2) goto L1c
            short r0 = r3.zzb
            short r2 = r4.zzb
            if (r0 != r2) goto L1c
            short r0 = r3.zzc
            short r4 = r4.zzc
            if (r0 != r4) goto L1c
            r4 = 1
            return r4
        L1c:
            return r1
    }

    public short getKeyProtectionType() {
            r1 = this;
            short r0 = r1.zzb
            return r0
    }

    public short getMatcherProtectionType() {
            r1 = this;
            short r0 = r1.zzc
            return r0
    }

    public int getUserVerificationMethod() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r3.zza
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            short r1 = r3.zzb
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            short r1 = r3.zzc
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            int r0 = r2.getUserVerificationMethod()
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r1, r0)
            short r0 = r2.getKeyProtectionType()
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeShort(r3, r1, r0)
            short r0 = r2.getMatcherProtectionType()
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeShort(r3, r1, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r4)
            return
    }
}
