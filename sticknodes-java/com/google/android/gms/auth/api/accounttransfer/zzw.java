package com.google.android.gms.auth.api.accounttransfer;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "AuthenticatorTransferInfoCreator")
/* loaded from: classes.dex */
public final class zzw extends com.google.android.gms.internal.auth.zzbz {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.accounttransfer.zzw> CREATOR = null;
    private static final java.util.HashMap zzc = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Indicator
    final java.util.Set zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    final int zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAccountType", id = 2)
    private java.lang.String zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getStatus", id = 3)
    private int zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getTransferBytes", id = 4)
    private byte[] zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPendingIntent", id = 5)
    private android.app.PendingIntent zzg;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDeviceMetaData", id = 6)
    private com.google.android.gms.auth.api.accounttransfer.DeviceMetaData zzh;

    static {
            com.google.android.gms.auth.api.accounttransfer.zzx r0 = new com.google.android.gms.auth.api.accounttransfer.zzx
            r0.<init>()
            com.google.android.gms.auth.api.accounttransfer.zzw.CREATOR = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.gms.auth.api.accounttransfer.zzw.zzc = r0
            java.lang.String r1 = "accountType"
            r2 = 2
            com.google.android.gms.common.server.response.FastJsonResponse$Field r2 = com.google.android.gms.common.server.response.FastJsonResponse.Field.forString(r1, r2)
            r0.put(r1, r2)
            java.lang.String r1 = "status"
            r2 = 3
            com.google.android.gms.common.server.response.FastJsonResponse$Field r2 = com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger(r1, r2)
            r0.put(r1, r2)
            java.lang.String r1 = "transferBytes"
            r2 = 4
            com.google.android.gms.common.server.response.FastJsonResponse$Field r2 = com.google.android.gms.common.server.response.FastJsonResponse.Field.forBase64(r1, r2)
            r0.put(r1, r2)
            return
    }

    public zzw() {
            r2 = this;
            r2.<init>()
            androidx.collection.ArraySet r0 = new androidx.collection.ArraySet
            r1 = 3
            r0.<init>(r1)
            r2.zza = r0
            r0 = 1
            r2.zzb = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzw(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Indicator java.util.Set r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) byte[] r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) android.app.PendingIntent r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) com.google.android.gms.auth.api.accounttransfer.DeviceMetaData r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzd = r3
            r0.zze = r4
            r0.zzf = r5
            r0.zzg = r6
            r0.zzh = r7
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ java.util.Map getFieldMappings() {
            r1 = this;
            java.util.HashMap r0 = com.google.android.gms.auth.api.accounttransfer.zzw.zzc
            return r0
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final java.lang.Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field r4) {
            r3 = this;
            int r0 = r4.getSafeParcelableFieldId()
            r1 = 1
            if (r0 == r1) goto L38
            r1 = 2
            if (r0 == r1) goto L35
            r1 = 3
            if (r0 == r1) goto L2e
            r1 = 4
            if (r0 != r1) goto L13
            byte[] r4 = r3.zzf
            return r4
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r4 = r4.getSafeParcelableFieldId()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown SafeParcelable id="
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L2e:
            int r4 = r3.zze
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            return r4
        L35:
            java.lang.String r4 = r3.zzd
            return r4
        L38:
            int r4 = r3.zzb
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            return r4
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field r2) {
            r1 = this;
            java.util.Set r0 = r1.zza
            int r2 = r2.getSafeParcelableFieldId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setDecodedBytesInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, java.lang.String r3, byte[] r4) {
            r1 = this;
            int r2 = r2.getSafeParcelableFieldId()
            r3 = 4
            if (r2 != r3) goto L13
            r1.zzf = r4
            java.util.Set r3 = r1.zza
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            return
        L13:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Field with id="
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = " is not known to be a byte array."
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, java.lang.String r3, int r4) {
            r1 = this;
            int r2 = r2.getSafeParcelableFieldId()
            r3 = 3
            if (r2 != r3) goto L13
            r1.zze = r4
            java.util.Set r3 = r1.zza
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            return
        L13:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Field with id="
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = " is not known to be an int."
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            int r2 = r2.getSafeParcelableFieldId()
            r3 = 2
            if (r2 != r3) goto L13
            r1.zzd = r4
            java.util.Set r3 = r1.zza
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            return
        L13:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r0 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r0] = r2
            java.lang.String r2 = "Field with id=%d is not known to be a string."
            java.lang.String r2 = java.lang.String.format(r2, r4)
            r3.<init>(r2)
            throw r3
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r6, int r7) {
            r5 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r6)
            java.util.Set r1 = r5.zza
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L16
            int r3 = r5.zzb
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r6, r2, r3)
        L16:
            r3 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L26
            java.lang.String r4 = r5.zzd
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r6, r3, r4, r2)
        L26:
            r3 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L36
            int r4 = r5.zze
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r6, r3, r4)
        L36:
            r3 = 4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L46
            byte[] r4 = r5.zzf
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r6, r3, r4, r2)
        L46:
            r3 = 5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L56
            android.app.PendingIntent r4 = r5.zzg
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r6, r3, r4, r7, r2)
        L56:
            r3 = 6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L66
            com.google.android.gms.auth.api.accounttransfer.DeviceMetaData r1 = r5.zzh
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r6, r3, r1, r7, r2)
        L66:
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r6, r0)
            return
    }
}
