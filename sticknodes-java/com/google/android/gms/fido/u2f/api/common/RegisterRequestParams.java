package com.google.android.gms.fido.u2f.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "RegisterRequestParamsCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
@java.lang.Deprecated
/* loaded from: classes.dex */
public class RegisterRequestParams extends com.google.android.gms.fido.u2f.api.common.RequestParams {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.u2f.api.common.RegisterRequestParams> CREATOR = null;
    public static final int MAX_DISPLAY_HINT_LENGTH = 80;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRequestId", id = 2)
    private final java.lang.Integer zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTimeoutSeconds", id = 3)
    private final java.lang.Double zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAppId", id = 4)
    private final android.net.Uri zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRegisterRequests", id = 5)
    private final java.util.List zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRegisteredKeys", id = 6)
    private final java.util.List zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getChannelIdValue", id = 7)
    private final com.google.android.gms.fido.u2f.api.common.ChannelIdValue zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDisplayHint", id = 8)
    private final java.lang.String zzg;
    private java.util.Set zzh;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static final class Builder {
        java.lang.Integer zza;
        java.lang.Double zzb;
        android.net.Uri zzc;
        java.util.List zzd;
        java.util.List zze;
        com.google.android.gms.fido.u2f.api.common.ChannelIdValue zzf;
        java.lang.String zzg;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.android.gms.fido.u2f.api.common.RegisterRequestParams build() {
                r9 = this;
                com.google.android.gms.fido.u2f.api.common.RegisterRequestParams r8 = new com.google.android.gms.fido.u2f.api.common.RegisterRequestParams
                java.lang.Integer r1 = r9.zza
                java.lang.Double r2 = r9.zzb
                android.net.Uri r3 = r9.zzc
                java.util.List r4 = r9.zzd
                java.util.List r5 = r9.zze
                com.google.android.gms.fido.u2f.api.common.ChannelIdValue r6 = r9.zzf
                java.lang.String r7 = r9.zzg
                r0 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r8
        }

        public com.google.android.gms.fido.u2f.api.common.RegisterRequestParams.Builder setAppId(android.net.Uri r1) {
                r0 = this;
                r0.zzc = r1
                return r0
        }

        public com.google.android.gms.fido.u2f.api.common.RegisterRequestParams.Builder setChannelIdValue(com.google.android.gms.fido.u2f.api.common.ChannelIdValue r1) {
                r0 = this;
                r0.zzf = r1
                return r0
        }

        public com.google.android.gms.fido.u2f.api.common.RegisterRequestParams.Builder setDisplayHint(java.lang.String r1) {
                r0 = this;
                r0.zzg = r1
                return r0
        }

        public com.google.android.gms.fido.u2f.api.common.RegisterRequestParams.Builder setRegisterRequests(java.util.List<com.google.android.gms.fido.u2f.api.common.RegisterRequest> r1) {
                r0 = this;
                r0.zzd = r1
                return r0
        }

        public com.google.android.gms.fido.u2f.api.common.RegisterRequestParams.Builder setRegisteredKeys(java.util.List<com.google.android.gms.fido.u2f.api.common.RegisteredKey> r1) {
                r0 = this;
                r0.zze = r1
                return r0
        }

        public com.google.android.gms.fido.u2f.api.common.RegisterRequestParams.Builder setRequestId(java.lang.Integer r1) {
                r0 = this;
                r0.zza = r1
                return r0
        }

        public com.google.android.gms.fido.u2f.api.common.RegisterRequestParams.Builder setTimeoutSeconds(java.lang.Double r1) {
                r0 = this;
                r0.zzb = r1
                return r0
        }
    }

    static {
            com.google.android.gms.fido.u2f.api.common.zzh r0 = new com.google.android.gms.fido.u2f.api.common.zzh
            r0.<init>()
            com.google.android.gms.fido.u2f.api.common.RegisterRequestParams.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    RegisterRequestParams(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.Integer r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.Double r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) android.net.Uri r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) java.util.List r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) java.util.List r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) com.google.android.gms.fido.u2f.api.common.ChannelIdValue r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) java.lang.String r10) {
            r3 = this;
            r3.<init>()
            r3.zza = r4
            r3.zzb = r5
            r3.zzc = r6
            r4 = 0
            r5 = 1
            if (r7 == 0) goto L15
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            java.lang.String r1 = "empty list of register requests is provided"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            r3.zzd = r7
            r3.zze = r8
            r3.zzf = r9
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            if (r6 == 0) goto L2b
            r9.add(r6)
        L2b:
            java.util.Iterator r7 = r7.iterator()
        L2f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r7.next()
            com.google.android.gms.fido.u2f.api.common.RegisterRequest r0 = (com.google.android.gms.fido.u2f.api.common.RegisterRequest) r0
            if (r6 != 0) goto L46
            java.lang.String r1 = r0.getAppId()
            if (r1 == 0) goto L44
            goto L46
        L44:
            r1 = 0
            goto L47
        L46:
            r1 = 1
        L47:
            java.lang.String r2 = "register request has null appId and no request appId is provided"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r2)
            java.lang.String r1 = r0.getAppId()
            if (r1 == 0) goto L2f
            java.lang.String r0 = r0.getAppId()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r9.add(r0)
            goto L2f
        L5e:
            java.util.Iterator r7 = r8.iterator()
        L62:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L91
            java.lang.Object r8 = r7.next()
            com.google.android.gms.fido.u2f.api.common.RegisteredKey r8 = (com.google.android.gms.fido.u2f.api.common.RegisteredKey) r8
            if (r6 != 0) goto L79
            java.lang.String r0 = r8.getAppId()
            if (r0 == 0) goto L77
            goto L79
        L77:
            r0 = 0
            goto L7a
        L79:
            r0 = 1
        L7a:
            java.lang.String r1 = "registered key has null appId and no request appId is provided"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            java.lang.String r0 = r8.getAppId()
            if (r0 == 0) goto L62
            java.lang.String r8 = r8.getAppId()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            r9.add(r8)
            goto L62
        L91:
            r3.zzh = r9
            if (r10 == 0) goto L9d
            int r6 = r10.length()
            r7 = 80
            if (r6 > r7) goto L9e
        L9d:
            r4 = 1
        L9e:
            java.lang.String r5 = "Display Hint cannot be longer than 80 characters"
            com.google.android.gms.common.internal.Preconditions.checkArgument(r4, r5)
            r3.zzg = r10
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.fido.u2f.api.common.RegisterRequestParams
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.fido.u2f.api.common.RegisterRequestParams r5 = (com.google.android.gms.fido.u2f.api.common.RegisterRequestParams) r5
            java.lang.Integer r1 = r4.zza
            java.lang.Integer r3 = r5.zza
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L67
            java.lang.Double r1 = r4.zzb
            java.lang.Double r3 = r5.zzb
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L67
            android.net.Uri r1 = r4.zzc
            android.net.Uri r3 = r5.zzc
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L67
            java.util.List r1 = r4.zzd
            java.util.List r3 = r5.zzd
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L67
            java.util.List r1 = r4.zze
            if (r1 != 0) goto L3c
            java.util.List r3 = r5.zze
            if (r3 == 0) goto L52
        L3c:
            if (r1 == 0) goto L67
            java.util.List r3 = r5.zze
            if (r3 == 0) goto L67
            boolean r1 = r1.containsAll(r3)
            if (r1 == 0) goto L67
            java.util.List r1 = r5.zze
            java.util.List r3 = r4.zze
            boolean r1 = r1.containsAll(r3)
            if (r1 == 0) goto L67
        L52:
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue r1 = r4.zzf
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue r3 = r5.zzf
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L67
            java.lang.String r1 = r4.zzg
            java.lang.String r5 = r5.zzg
            boolean r5 = com.google.android.gms.common.internal.Objects.equal(r1, r5)
            if (r5 == 0) goto L67
            return r0
        L67:
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

    @Override // com.google.android.gms.fido.u2f.api.common.RequestParams
    public java.lang.String getDisplayHint() {
            r1 = this;
            java.lang.String r0 = r1.zzg
            return r0
    }

    public java.util.List<com.google.android.gms.fido.u2f.api.common.RegisterRequest> getRegisterRequests() {
            r1 = this;
            java.util.List r0 = r1.zzd
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
            java.util.List r1 = r3.zzd
            r2 = 3
            r0[r2] = r1
            java.util.List r1 = r3.zze
            r2 = 4
            r0[r2] = r1
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue r1 = r3.zzf
            r2 = 5
            r0[r2] = r1
            java.lang.String r1 = r3.zzg
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
            java.util.List r1 = r4.getRegisterRequests()
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r5, r2, r1, r3)
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
