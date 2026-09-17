package com.google.android.gms.common.api;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@com.google.android.gms.common.annotation.KeepForSdk
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ApiMetadataCreator")
/* loaded from: classes.dex */
public final class ApiMetadata extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.ApiMetadata> CREATOR = null;
    private static final com.google.android.gms.common.api.ApiMetadata zza = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getComplianceOptions", id = 1)
    private final com.google.android.gms.common.api.ComplianceOptions zzb;

    /* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final class Builder {
        private com.google.android.gms.common.api.ComplianceOptions zza;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.common.api.ApiMetadata build() {
                r2 = this;
                com.google.android.gms.common.api.ApiMetadata r0 = new com.google.android.gms.common.api.ApiMetadata
                com.google.android.gms.common.api.ComplianceOptions r1 = r2.zza
                r0.<init>(r1)
                return r0
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.common.api.ApiMetadata.Builder setComplianceOptions(com.google.android.gms.common.api.ComplianceOptions r1) {
                r0 = this;
                r0.zza = r1
                return r0
        }
    }

    static {
            com.google.android.gms.common.api.zza r0 = com.google.android.gms.common.api.zza.zza()
            com.google.android.gms.common.api.ApiMetadata.CREATOR = r0
            com.google.android.gms.common.api.ApiMetadata$Builder r0 = newBuilder()
            com.google.android.gms.common.api.ApiMetadata r0 = r0.build()
            com.google.android.gms.common.api.ApiMetadata.zza = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    ApiMetadata(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) com.google.android.gms.common.api.ComplianceOptions r1) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.common.api.ApiMetadata fromComplianceOptions(com.google.android.gms.common.api.ComplianceOptions r1) {
            com.google.android.gms.common.api.ApiMetadata$Builder r0 = newBuilder()
            r0.setComplianceOptions(r1)
            com.google.android.gms.common.api.ApiMetadata r1 = r0.build()
            return r1
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static final com.google.android.gms.common.api.ApiMetadata getEmptyInstance() {
            com.google.android.gms.common.api.ApiMetadata r0 = com.google.android.gms.common.api.ApiMetadata.zza
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.api.ApiMetadata.Builder newBuilder() {
            com.google.android.gms.common.api.ApiMetadata$Builder r0 = new com.google.android.gms.common.api.ApiMetadata$Builder
            r0.<init>()
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.gms.common.api.ApiMetadata
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            com.google.android.gms.common.api.ApiMetadata r2 = (com.google.android.gms.common.api.ApiMetadata) r2
            com.google.android.gms.common.api.ComplianceOptions r0 = r1.zzb
            com.google.android.gms.common.api.ComplianceOptions r2 = r2.zzb
            boolean r2 = java.util.Objects.equals(r0, r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            com.google.android.gms.common.api.ComplianceOptions r0 = r1.zzb
            int r0 = java.util.Objects.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            com.google.android.gms.common.api.ComplianceOptions r0 = r3.zzb
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ApiMetadata(complianceOptions="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            r0 = -204102970(0xfffffffff3d5a2c6, float:-3.385195E31)
            r5.writeInt(r0)
            com.google.android.gms.common.api.ComplianceOptions r0 = r4.zzb
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r0, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r1)
            return
    }
}
