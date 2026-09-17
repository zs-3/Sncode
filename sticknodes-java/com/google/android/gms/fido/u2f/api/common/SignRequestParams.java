package com.google.android.gms.fido.u2f.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "SignRequestParamsCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
@java.lang.Deprecated
/* loaded from: classes.dex */
public class SignRequestParams extends com.google.android.gms.fido.u2f.api.common.RequestParams {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.u2f.api.common.SignRequestParams> CREATOR = null;
    public static final int MAX_DISPLAY_HINT_LENGTH = 80;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRequestId", id = 2)
    private final java.lang.Integer zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTimeoutSeconds", id = 3)
    private final java.lang.Double zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAppId", id = 4)
    private final android.net.Uri zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDefaultSignChallenge", id = 5)
    private final byte[] zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRegisteredKeys", id = 6)
    private final java.util.List zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getChannelIdValue", id = 7)
    private final com.google.android.gms.fido.u2f.api.common.ChannelIdValue zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDisplayHint", id = 8)
    private final java.lang.String zzg;
    private final java.util.Set zzh;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static final class Builder {
        java.lang.Integer zza;
        java.lang.Double zzb;
        android.net.Uri zzc;
        byte[] zzd;
        java.util.List zze;
        com.google.android.gms.fido.u2f.api.common.ChannelIdValue zzf;
        java.lang.String zzg;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.android.gms.fido.u2f.api.common.SignRequestParams build() {
                r9 = this;
                com.google.android.gms.fido.u2f.api.common.SignRequestParams r8 = new com.google.android.gms.fido.u2f.api.common.SignRequestParams
                java.lang.Integer r1 = r9.zza
                java.lang.Double r2 = r9.zzb
                android.net.Uri r3 = r9.zzc
                byte[] r4 = r9.zzd
                java.util.List r5 = r9.zze
                com.google.android.gms.fido.u2f.api.common.ChannelIdValue r6 = r9.zzf
                java.lang.String r7 = r9.zzg
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r8
        }

        public com.google.android.gms.fido.u2f.api.common.SignRequestParams.Builder setAppId(android.net.Uri r1) {
                r0 = this;
                r0.zzc = r1
                return r0
        }

        public com.google.android.gms.fido.u2f.api.common.SignRequestParams.Builder setChannelIdValue(com.google.android.gms.fido.u2f.api.common.ChannelIdValue r1) {
                r0 = this;
                r0.zzf = r1
                return r0
        }

        public com.google.android.gms.fido.u2f.api.common.SignRequestParams.Builder setDefaultSignChallenge(byte[] r1) {
                r0 = this;
                r0.zzd = r1
                return r0
        }

        public com.google.android.gms.fido.u2f.api.common.SignRequestParams.Builder setDisplayHint(java.lang.String r1) {
                r0 = this;
                r0.zzg = r1
                return r0
        }

        public com.google.android.gms.fido.u2f.api.common.SignRequestParams.Builder setRegisteredKeys(java.util.List<com.google.android.gms.fido.u2f.api.common.RegisteredKey> r1) {
                r0 = this;
                r0.zze = r1
                return r0
        }

        public com.google.android.gms.fido.u2f.api.common.SignRequestParams.Builder setRequestId(java.lang.Integer r1) {
                r0 = this;
                r0.zza = r1
                return r0
        }

        public com.google.android.gms.fido.u2f.api.common.SignRequestParams.Builder setTimeoutSeconds(java.lang.Double r1) {
                r0 = this;
                r0.zzb = r1
                return r0
        }
    }

    static {
            com.google.android.gms.fido.u2f.api.common.zzk r0 = new com.google.android.gms.fido.u2f.api.common.zzk
            r0.<init>()
            com.google.android.gms.fido.u2f.api.common.SignRequestParams.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    SignRequestParams(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.Integer r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.Double r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) android.net.Uri r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) byte[] r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) java.util.List r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) com.google.android.gms.fido.u2f.api.common.ChannelIdValue r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) java.lang.String r9) {
            r2 = this;
            r2.<init>()
            r2.zza = r3
            r2.zzb = r4
            r2.zzc = r5
            r2.zzd = r6
            r3 = 0
            r4 = 1
            if (r7 == 0) goto L17
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L17
            r6 = 1
            goto L18
        L17:
            r6 = 0
        L18:
            java.lang.String r0 = "registeredKeys must not be null or empty"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r6, r0)
            r2.zze = r7
            r2.zzf = r8
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            if (r5 == 0) goto L2b
            r6.add(r5)
        L2b:
            java.util.Iterator r7 = r7.iterator()
        L2f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L67
            java.lang.Object r8 = r7.next()
            com.google.android.gms.fido.u2f.api.common.RegisteredKey r8 = (com.google.android.gms.fido.u2f.api.common.RegisteredKey) r8
            java.lang.String r0 = r8.getAppId()
            if (r0 != 0) goto L46
            if (r5 == 0) goto L44
            goto L46
        L44:
            r0 = 0
            goto L47
        L46:
            r0 = 1
        L47:
            java.lang.String r1 = "registered key has null appId and no request appId is provided"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            java.lang.String r0 = r8.getChallengeValue()
            java.lang.String r0 = "register request has null challenge and no default challenge isprovided"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r4, r0)
            java.lang.String r0 = r8.getAppId()
            if (r0 == 0) goto L2f
            java.lang.String r8 = r8.getAppId()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            r6.add(r8)
            goto L2f
        L67:
            r2.zzh = r6
            if (r9 == 0) goto L73
            int r5 = r9.length()
            r6 = 80
            if (r5 > r6) goto L74
        L73:
            r3 = 1
        L74:
            java.lang.String r4 = "Display Hint cannot be longer than 80 characters"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r3, r4)
            r2.zzg = r9
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.fido.u2f.api.common.SignRequestParams
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.fido.u2f.api.common.SignRequestParams r5 = (com.google.android.gms.fido.u2f.api.common.SignRequestParams) r5
            java.lang.Integer r1 = r4.zza
            java.lang.Integer r3 = r5.zza
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L5d
            java.lang.Double r1 = r4.zzb
            java.lang.Double r3 = r5.zzb
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L5d
            android.net.Uri r1 = r4.zzc
            android.net.Uri r3 = r5.zzc
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L5d
            byte[] r1 = r4.zzd
            byte[] r3 = r5.zzd
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L5d
            java.util.List r1 = r4.zze
            java.util.List r3 = r5.zze
            boolean r1 = r1.containsAll(r3)
            if (r1 == 0) goto L5d
            java.util.List r1 = r5.zze
            java.util.List r3 = r4.zze
            boolean r1 = r1.containsAll(r3)
            if (r1 == 0) goto L5d
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue r1 = r4.zzf
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue r3 = r5.zzf
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L5d
            java.lang.String r1 = r4.zzg
            java.lang.String r5 = r5.zzg
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r1, r5)
            if (r5 == 0) goto L5d
            return r0
        L5d:
            return r2
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public java.util.Set<android.net.Uri> getAllAppIds() {
            r1 = this;
            java.util.Set r0 = r1.zzh
            return r0
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public android.net.Uri getAppId() {
            r1 = this;
            android.net.Uri r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public com.google.android.gms.fido.u2f.api.common.ChannelIdValue getChannelIdValue() {
            r1 = this;
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue r0 = r1.zzf
            return r0
    }

    public byte[] getDefaultSignChallenge() {
            r1 = this;
            byte[] r0 = r1.zzd
            return r0
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public java.lang.String getDisplayHint() {
            r1 = this;
            java.lang.String r0 = r1.zzg
            return r0
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public java.util.List<com.google.android.gms.fido.u2f.api.common.RegisteredKey> getRegisteredKeys() {
            r1 = this;
            java.util.List r0 = r1.zze
            return r0
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public java.lang.Integer getRequestId() {
            r1 = this;
            java.lang.Integer r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public java.lang.Double getTimeoutSeconds() {
            r1 = this;
            java.lang.Double r0 = r1.zzb
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 7
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = r3.zza
            r2 = 0
            r0[r2] = r1
            android.net.Uri r1 = r3.zzc
            r2 = 1
            r0[r2] = r1
            java.lang.Double r1 = r3.zzb
            r2 = 2
            r0[r2] = r1
            java.util.List r1 = r3.zze
            r2 = 3
            r0[r2] = r1
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue r1 = r3.zzf
            r2 = 4
            r0[r2] = r1
            java.lang.String r1 = r3.zzg
            r2 = 5
            r0[r2] = r1
            byte[] r1 = r3.zzd
            int r1 = java.util.Arrays.hashCode(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 6
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            java.lang.Integer r1 = r4.getRequestId()
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerObject(r5, r2, r1, r3)
            java.lang.Double r1 = r4.getTimeoutSeconds()
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDoubleObject(r5, r2, r1, r3)
            android.net.Uri r1 = r4.getAppId()
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            byte[] r1 = r4.getDefaultSignChallenge()
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r5, r2, r1, r3)
            java.util.List r1 = r4.getRegisteredKeys()
            r2 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r5, r2, r1, r3)
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue r1 = r4.getChannelIdValue()
            r2 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            java.lang.String r6 = r4.getDisplayHint()
            r1 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }
}
