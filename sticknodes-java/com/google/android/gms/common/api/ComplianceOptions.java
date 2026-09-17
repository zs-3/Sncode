package com.google.android.gms.common.api;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@com.google.android.gms.common.annotation.KeepForSdk
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ComplianceOptionsCreator")
/* loaded from: classes.dex */
public final class ComplianceOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.ComplianceOptions> CREATOR = null;
    public static final com.google.android.gms.common.api.ComplianceOptions zza = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getCallerProductId", id = 1)
    private final int zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDataOwnerProductId", id = 2)
    private final int zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getProcessingReason", id = 3)
    private final int zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(defaultValue = "true", getter = "isUserData", id = 4)
    private final boolean zze;

    /* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final class Builder {
        private int zza;
        private int zzb;
        private int zzc;
        private boolean zzd;

        public Builder() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.zza = r0
                r1.zzb = r0
                r0 = 0
                r1.zzc = r0
                r0 = 1
                r1.zzd = r0
                return
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.common.api.ComplianceOptions build() {
                r5 = this;
                com.google.android.gms.common.api.ComplianceOptions r0 = new com.google.android.gms.common.api.ComplianceOptions
                int r1 = r5.zza
                int r2 = r5.zzb
                int r3 = r5.zzc
                boolean r4 = r5.zzd
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.common.api.ComplianceOptions.Builder setCallerProductId(int r1) {
                r0 = this;
                r0.zza = r1
                return r0
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.common.api.ComplianceOptions.Builder setDataOwnerProductId(int r1) {
                r0 = this;
                r0.zzb = r1
                return r0
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.common.api.ComplianceOptions.Builder setIsUserData(boolean r1) {
                r0 = this;
                r0.zzd = r1
                return r0
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.common.api.ComplianceOptions.Builder setProcessingReason(int r1) {
                r0 = this;
                r0.zzc = r1
                return r0
        }
    }

    static {
            com.google.android.gms.common.api.ComplianceOptions$Builder r0 = newBuilder()
            r1 = -1
            r0.setCallerProductId(r1)
            r0.setDataOwnerProductId(r1)
            r1 = 0
            r0.setProcessingReason(r1)
            r1 = 1
            r0.setIsUserData(r1)
            com.google.android.gms.common.api.ComplianceOptions r0 = r0.build()
            com.google.android.gms.common.api.ComplianceOptions.zza = r0
            com.google.android.gms.common.api.zzc r0 = new com.google.android.gms.common.api.zzc
            r0.<init>()
            com.google.android.gms.common.api.ComplianceOptions.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    ComplianceOptions(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) boolean r4) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            r0.zzd = r3
            r0.zze = r4
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.api.ComplianceOptions.Builder newBuilder() {
            com.google.android.gms.common.api.ComplianceOptions$Builder r0 = new com.google.android.gms.common.api.ComplianceOptions$Builder
            r0.<init>()
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.common.api.ComplianceOptions.Builder newBuilder(android.content.Context r0) {
            com.google.android.gms.common.api.ComplianceOptions$Builder r0 = newBuilder()
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.common.api.ComplianceOptions
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.common.api.ComplianceOptions r4 = (com.google.android.gms.common.api.ComplianceOptions) r4
            int r0 = r3.zzb
            int r2 = r4.zzb
            if (r0 != r2) goto L22
            int r0 = r3.zzc
            int r2 = r4.zzc
            if (r0 != r2) goto L22
            int r0 = r3.zzd
            int r2 = r4.zzd
            if (r0 != r2) goto L22
            boolean r0 = r3.zze
            boolean r4 = r4.zze
            if (r0 != r4) goto L22
            r4 = 1
            return r4
        L22:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r3.zzb
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r1 = r3.zzc
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            int r1 = r3.zzd
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            boolean r1 = r3.zze
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.common.api.ComplianceOptions.Builder toBuilder() {
            r2 = this;
            com.google.android.gms.common.api.ComplianceOptions$Builder r0 = new com.google.android.gms.common.api.ComplianceOptions$Builder
            r0.<init>()
            int r1 = r2.zzb
            r0.setCallerProductId(r1)
            int r1 = r2.zzc
            r0.setDataOwnerProductId(r1)
            int r1 = r2.zzd
            r0.setProcessingReason(r1)
            boolean r1 = r2.zze
            r0.setIsUserData(r1)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ComplianceOptions{callerProductId="
            r0.append(r1)
            int r1 = r2.zzb
            r0.append(r1)
            java.lang.String r1 = ", dataOwnerProductId="
            r0.append(r1)
            int r1 = r2.zzc
            r0.append(r1)
            java.lang.String r1 = ", processingReason="
            r0.append(r1)
            int r1 = r2.zzd
            r0.append(r1)
            java.lang.String r1 = ", isUserData="
            r0.append(r1)
            boolean r1 = r2.zze
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = r2.zzb
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r1, r4)
            int r4 = r2.zzc
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r1, r4)
            int r4 = r2.zzd
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r1, r4)
            boolean r4 = r2.zze
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r3, r1, r4)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r0)
            return
    }
}
