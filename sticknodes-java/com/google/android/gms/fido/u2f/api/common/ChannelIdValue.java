package com.google.android.gms.fido.u2f.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "ChannelIdValueCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
@java.lang.Deprecated
/* loaded from: classes.dex */
public class ChannelIdValue extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final com.google.android.gms.fido.u2f.api.common.ChannelIdValue ABSENT = null;
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.u2f.api.common.ChannelIdValue> CREATOR = null;
    public static final com.google.android.gms.fido.u2f.api.common.ChannelIdValue UNAVAILABLE = null;
    public static final com.google.android.gms.fido.u2f.api.common.ChannelIdValue UNUSED = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTypeAsInt", id = 2, type = "int")
    private final com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getStringValue", id = 3)
    private final java.lang.String zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getObjectValueAsString", id = 4)
    private final java.lang.String zzc;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public enum ChannelIdValueType extends java.lang.Enum<com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType> implements android.os.Parcelable {
        public static final com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType ABSENT = null;
        public static final android.os.Parcelable.Creator<com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType> CREATOR = null;
        public static final com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType OBJECT = null;
        public static final com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType STRING = null;
        private static final /* synthetic */ com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType[] zza = null;
        private final int zzb;

        static {
                com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType r0 = new com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType
                java.lang.String r1 = "ABSENT"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType.ABSENT = r0
                com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType r1 = new com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType
                java.lang.String r3 = "STRING"
                r4 = 1
                r1.<init>(r3, r4, r4)
                com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType.STRING = r1
                com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType r3 = new com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType
                java.lang.String r5 = "OBJECT"
                r6 = 2
                r3.<init>(r5, r6, r6)
                com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType.OBJECT = r3
                r5 = 3
                com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType[] r5 = new com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType.zza = r5
                com.google.android.gms.fido.u2f.api.common.zza r0 = new com.google.android.gms.fido.u2f.api.common.zza
                r0.<init>()
                com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType.CREATOR = r0
                return
        }

        ChannelIdValueType(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.zzb = r3
                return
        }

        public static com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType valueOf(java.lang.String r1) {
                java.lang.Class<com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType> r0 = com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType r1 = (com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType) r1
                return r1
        }

        public static com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType[] values() {
                com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType[] r0 = com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType.zza
                java.lang.Object r0 = r0.clone()
                com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType[] r0 = (com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType[]) r0
                return r0
        }

        static /* bridge */ /* synthetic */ int zza(com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType r0) {
                int r0 = r0.zzb
                return r0
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                int r2 = r0.zzb
                r1.writeInt(r2)
                return
        }
    }

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static class UnsupportedChannelIdValueTypeException extends java.lang.Exception {
        public UnsupportedChannelIdValueTypeException(int r3) {
                r2 = this;
                r0 = 1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1 = 0
                r0[r1] = r3
                java.lang.String r3 = "ChannelIdValueType %s not supported"
                java.lang.String r3 = java.lang.String.format(r3, r0)
                r2.<init>(r3)
                return
        }
    }

    static {
            com.google.android.gms.fido.u2f.api.common.zzb r0 = new com.google.android.gms.fido.u2f.api.common.zzb
            r0.<init>()
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue.CREATOR = r0
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue r0 = new com.google.android.gms.fido.u2f.api.common.ChannelIdValue
            r0.<init>()
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ABSENT = r0
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue r0 = new com.google.android.gms.fido.u2f.api.common.ChannelIdValue
            java.lang.String r1 = "unavailable"
            r0.<init>(r1)
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue.UNAVAILABLE = r0
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue r0 = new com.google.android.gms.fido.u2f.api.common.ChannelIdValue
            java.lang.String r1 = "unused"
            r0.<init>(r1)
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue.UNUSED = r0
            return
    }

    private ChannelIdValue() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType r0 = com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType.ABSENT
            r1.zza = r0
            r0 = 0
            r1.zzc = r0
            r1.zzb = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    ChannelIdValue(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r3) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType r1 = toChannelIdValueType(r1)     // Catch: com.google.android.gms.fido.u2f.api.common.ChannelIdValue.UnsupportedChannelIdValueTypeException -> Le
            r0.zza = r1     // Catch: com.google.android.gms.fido.u2f.api.common.ChannelIdValue.UnsupportedChannelIdValueTypeException -> Le
            r0.zzb = r2
            r0.zzc = r3
            return
        Le:
            r1 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            throw r2
    }

    private ChannelIdValue(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.zzb = r1
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType r1 = com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType.STRING
            r0.zza = r1
            r1 = 0
            r0.zzc = r1
            return
    }

    public ChannelIdValue(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>()
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.zzc = r1
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType r1 = com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType.OBJECT
            r0.zza = r1
            r1 = 0
            r0.zzb = r1
            return
    }

    public static com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType toChannelIdValueType(int r5) throws com.google.android.gms.fido.u2f.api.common.ChannelIdValue.UnsupportedChannelIdValueTypeException {
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType[] r0 = com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType.values()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L14
            r3 = r0[r2]
            int r4 = com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType.zza(r3)
            if (r5 != r4) goto L11
            return r3
        L11:
            int r2 = r2 + 1
            goto L6
        L14:
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue$UnsupportedChannelIdValueTypeException r0 = new com.google.android.gms.fido.u2f.api.common.ChannelIdValue$UnsupportedChannelIdValueTypeException
            r0.<init>(r5)
            throw r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.fido.u2f.api.common.ChannelIdValue
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue r5 = (com.google.android.gms.fido.u2f.api.common.ChannelIdValue) r5
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType r1 = r4.zza
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType r3 = r5.zza
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType r1 = r4.zza
            int r1 = r1.ordinal()
            if (r1 == 0) goto L37
            if (r1 == r0) goto L2e
            r0 = 2
            if (r1 == r0) goto L25
            return r2
        L25:
            java.lang.String r0 = r4.zzc
            java.lang.String r5 = r5.zzc
            boolean r5 = r0.equals(r5)
            return r5
        L2e:
            java.lang.String r0 = r4.zzb
            java.lang.String r5 = r5.zzb
            boolean r5 = r0.equals(r5)
            return r5
        L37:
            return r0
    }

    public org.json.JSONObject getObjectValue() {
            r2 = this;
            java.lang.String r0 = r2.zzc
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Le
            java.lang.String r1 = r2.zzc     // Catch: org.json.JSONException -> Le
            r0.<init>(r1)     // Catch: org.json.JSONException -> Le
            return r0
        Le:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public java.lang.String getObjectValueAsString() {
            r1 = this;
            java.lang.String r0 = r1.zzc
            return r0
    }

    public java.lang.String getStringValue() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    public com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType getType() {
            r1 = this;
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType r0 = r1.zza
            return r0
    }

    public int getTypeAsInt() {
            r1 = this;
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType r0 = r1.zza
            int r0 = com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType.zza(r0)
            return r0
    }

    public int hashCode() {
            r3 = this;
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType r0 = r3.zza
            int r0 = r0.hashCode()
            int r0 = r0 + 31
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType r1 = r3.zza
            int r1 = r1.ordinal()
            r2 = 1
            if (r1 == r2) goto L1f
            r2 = 2
            if (r1 == r2) goto L15
            return r0
        L15:
            int r0 = r0 * 31
            java.lang.String r1 = r3.zzc
            int r1 = r1.hashCode()
        L1d:
            int r0 = r0 + r1
            return r0
        L1f:
            int r0 = r0 * 31
            java.lang.String r1 = r3.zzb
            int r1 = r1.hashCode()
            goto L1d
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            int r0 = r3.getTypeAsInt()
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            java.lang.String r0 = r3.getStringValue()
            r1 = 3
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            java.lang.String r0 = r3.getObjectValueAsString()
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
