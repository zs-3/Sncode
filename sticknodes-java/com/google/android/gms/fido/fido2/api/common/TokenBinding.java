package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "TokenBindingCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public class TokenBinding extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.TokenBinding> CREATOR = null;
    public static final com.google.android.gms.fido.fido2.api.common.TokenBinding NOT_SUPPORTED = null;
    public static final com.google.android.gms.fido.fido2.api.common.TokenBinding SUPPORTED = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTokenBindingStatusAsString", id = 2, type = "java.lang.String")
    private final com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTokenBindingId", id = 3)
    private final java.lang.String zzb;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public enum TokenBindingStatus extends java.lang.Enum<com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus> implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus> CREATOR = null;
        public static final com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus NOT_SUPPORTED = null;
        public static final com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus PRESENT = null;
        public static final com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus SUPPORTED = null;
        private static final /* synthetic */ com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus[] zza = null;
        private final java.lang.String zzb;

        static {
                com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus r0 = new com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus
                java.lang.String r1 = "PRESENT"
                r2 = 0
                java.lang.String r3 = "present"
                r0.<init>(r1, r2, r3)
                com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus.PRESENT = r0
                com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus r1 = new com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus
                java.lang.String r3 = "SUPPORTED"
                r4 = 1
                java.lang.String r5 = "supported"
                r1.<init>(r3, r4, r5)
                com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus.SUPPORTED = r1
                com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus r3 = new com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus
                java.lang.String r5 = "NOT_SUPPORTED"
                r6 = 2
                java.lang.String r7 = "not-supported"
                r3.<init>(r5, r6, r7)
                com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus.NOT_SUPPORTED = r3
                r5 = 3
                com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus[] r5 = new com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus.zza = r5
                com.google.android.gms.fido.fido2.api.common.zzat r0 = new com.google.android.gms.fido.fido2.api.common.zzat
                r0.<init>()
                com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus.CREATOR = r0
                return
        }

        TokenBindingStatus(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.zzb = r3
                return
        }

        public static com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus fromString(java.lang.String r5) throws com.google.android.gms.fido.fido2.api.common.TokenBinding.UnsupportedTokenBindingStatusException {
                com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus[] r0 = values()
                int r1 = r0.length
                r2 = 0
            L6:
                if (r2 >= r1) goto L16
                r3 = r0[r2]
                java.lang.String r4 = r3.zzb
                boolean r4 = r5.equals(r4)
                if (r4 == 0) goto L13
                return r3
            L13:
                int r2 = r2 + 1
                goto L6
            L16:
                com.google.android.gms.fido.fido2.api.common.TokenBinding$UnsupportedTokenBindingStatusException r0 = new com.google.android.gms.fido.fido2.api.common.TokenBinding$UnsupportedTokenBindingStatusException
                r0.<init>(r5)
                throw r0
        }

        public static com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus valueOf(java.lang.String r1) {
                java.lang.Class<com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus> r0 = com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus r1 = (com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus) r1
                return r1
        }

        public static com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus[] values() {
                com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus[] r0 = com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus.zza
                java.lang.Object r0 = r0.clone()
                com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus[] r0 = (com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus[]) r0
                return r0
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = r1.zzb
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                java.lang.String r2 = r0.zzb
                r1.writeString(r2)
                return
        }
    }

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static class UnsupportedTokenBindingStatusException extends java.lang.Exception {
        public UnsupportedTokenBindingStatusException(java.lang.String r3) {
                r2 = this;
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                r0[r1] = r3
                java.lang.String r3 = "TokenBindingStatus %s not supported"
                java.lang.String r3 = java.lang.String.format(r3, r0)
                r2.<init>(r3)
                return
        }
    }

    static {
            com.google.android.gms.fido.fido2.api.common.zzau r0 = new com.google.android.gms.fido.fido2.api.common.zzau
            r0.<init>()
            com.google.android.gms.fido.fido2.api.common.TokenBinding.CREATOR = r0
            com.google.android.gms.fido.fido2.api.common.TokenBinding r0 = new com.google.android.gms.fido.fido2.api.common.TokenBinding
            com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus r1 = com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus.SUPPORTED
            java.lang.String r1 = r1.toString()
            r2 = 0
            r0.<init>(r1, r2)
            com.google.android.gms.fido.fido2.api.common.TokenBinding.SUPPORTED = r0
            com.google.android.gms.fido.fido2.api.common.TokenBinding r0 = new com.google.android.gms.fido.fido2.api.common.TokenBinding
            com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus r1 = com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus.NOT_SUPPORTED
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r2)
            com.google.android.gms.fido.fido2.api.common.TokenBinding.NOT_SUPPORTED = r0
            return
    }

    public TokenBinding(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus r0 = com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus.PRESENT
            java.lang.String r0 = r0.toString()
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.<init>(r0, r2)
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    TokenBinding(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r2) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus r1 = com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus.fromString(r1)     // Catch: com.google.android.gms.fido.fido2.api.common.TokenBinding.UnsupportedTokenBindingStatusException -> Lf
            r0.zza = r1     // Catch: com.google.android.gms.fido.fido2.api.common.TokenBinding.UnsupportedTokenBindingStatusException -> Lf
            r0.zzb = r2
            return
        Lf:
            r1 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            throw r2
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.fido.fido2.api.common.TokenBinding
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.fido.fido2.api.common.TokenBinding r4 = (com.google.android.gms.fido.fido2.api.common.TokenBinding) r4
            com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus r0 = r3.zza
            com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus r2 = r4.zza
            boolean r0 = com.google.android.gms.internal.fido.zzal.zza(r0, r2)
            if (r0 == 0) goto L1e
            java.lang.String r0 = r3.zzb
            java.lang.String r4 = r4.zzb
            boolean r4 = com.google.android.gms.internal.fido.zzal.zza(r0, r4)
            if (r4 == 0) goto L1e
            r4 = 1
            return r4
        L1e:
            return r1
    }

    public java.lang.String getTokenBindingId() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    public java.lang.String getTokenBindingStatusAsString() {
            r1 = this;
            com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus r0 = r1.zza
            java.lang.String r0 = r0.toString()
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus r1 = r3.zza
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.zzb
            r2 = 1
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public org.json.JSONObject toJsonObject() throws org.json.JSONException {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L16
            r0.<init>()     // Catch: org.json.JSONException -> L16
            java.lang.String r1 = "status"
            com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus r2 = r3.zza     // Catch: org.json.JSONException -> L16
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L16
            java.lang.String r1 = "id"
            java.lang.String r2 = r3.zzb     // Catch: org.json.JSONException -> L16
            org.json.JSONObject r0 = r0.put(r1, r2)     // Catch: org.json.JSONException -> L16
            return r0
        L16:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.lang.String r0 = r3.getTokenBindingStatusAsString()
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            java.lang.String r0 = r3.getTokenBindingId()
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
