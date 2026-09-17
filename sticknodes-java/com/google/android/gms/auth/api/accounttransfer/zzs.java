package com.google.android.gms.auth.api.accounttransfer;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "AccountTransferProgressCreator")
/* loaded from: classes.dex */
public final class zzs extends com.google.android.gms.internal.auth.zzbz {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.accounttransfer.zzs> CREATOR = null;
    private static final androidx.collection.ArrayMap zzb = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    final int zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRegisteredAccountTypes", id = 2)
    private java.util.List zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getInProgressAccountTypes", id = 3)
    private java.util.List zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getSuccessAccountTypes", id = 4)
    private java.util.List zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getFailedAccountTypes", id = 5)
    private java.util.List zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getEscrowedAccountTypes", id = 6)
    private java.util.List zzg;

    static {
            com.google.android.gms.auth.api.accounttransfer.zzt r0 = new com.google.android.gms.auth.api.accounttransfer.zzt
            r0.<init>()
            com.google.android.gms.auth.api.accounttransfer.zzs.CREATOR = r0
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            com.google.android.gms.auth.api.accounttransfer.zzs.zzb = r0
            java.lang.String r1 = "registered"
            r2 = 2
            com.google.android.gms.common.server.response.FastJsonResponse$Field r2 = com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings(r1, r2)
            r0.put(r1, r2)
            java.lang.String r1 = "in_progress"
            r2 = 3
            com.google.android.gms.common.server.response.FastJsonResponse$Field r2 = com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings(r1, r2)
            r0.put(r1, r2)
            java.lang.String r1 = "success"
            r2 = 4
            com.google.android.gms.common.server.response.FastJsonResponse$Field r2 = com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings(r1, r2)
            r0.put(r1, r2)
            java.lang.String r1 = "failed"
            r2 = 5
            com.google.android.gms.common.server.response.FastJsonResponse$Field r2 = com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings(r1, r2)
            r0.put(r1, r2)
            java.lang.String r1 = "escrowed"
            r2 = 6
            com.google.android.gms.common.server.response.FastJsonResponse$Field r2 = com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings(r1, r2)
            r0.put(r1, r2)
            return
    }

    public zzs() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zza = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzs(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.util.List r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.util.List r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.util.List r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) java.util.List r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) java.util.List r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzc = r2
            r0.zzd = r3
            r0.zze = r4
            r0.zzf = r5
            r0.zzg = r6
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final java.util.Map getFieldMappings() {
            r1 = this;
            androidx.collection.ArrayMap r0 = com.google.android.gms.auth.api.accounttransfer.zzs.zzb
            return r0
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final java.lang.Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field r4) {
            r3 = this;
            int r0 = r4.getSafeParcelableFieldId()
            switch(r0) {
                case 1: goto L31;
                case 2: goto L2e;
                case 3: goto L2b;
                case 4: goto L28;
                case 5: goto L25;
                case 6: goto L22;
                default: goto L7;
            }
        L7:
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
        L22:
            java.util.List r4 = r3.zzg
            return r4
        L25:
            java.util.List r4 = r3.zzf
            return r4
        L28:
            java.util.List r4 = r3.zze
            return r4
        L2b:
            java.util.List r4 = r3.zzd
            return r4
        L2e:
            java.util.List r4 = r3.zzc
            return r4
        L31:
            int r4 = r3.zza
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            return r4
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setStringsInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, java.lang.String r3, java.util.ArrayList r4) {
            r1 = this;
            int r2 = r2.getSafeParcelableFieldId()
            r3 = 2
            if (r2 == r3) goto L35
            r3 = 3
            if (r2 == r3) goto L32
            r3 = 4
            if (r2 == r3) goto L2f
            r3 = 5
            if (r2 == r3) goto L2c
            r3 = 6
            if (r2 != r3) goto L16
            r1.zzg = r4
            return
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r0 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r0] = r2
            java.lang.String r2 = "Field with id=%d is not known to be a string list."
            java.lang.String r2 = java.lang.String.format(r2, r4)
            r3.<init>(r2)
            throw r3
        L2c:
            r1.zzf = r4
            return
        L2f:
            r1.zze = r4
            return
        L32:
            r1.zzd = r4
            return
        L35:
            r1.zzc = r4
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            int r0 = r3.zza
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            java.util.List r0 = r3.zzc
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(r4, r1, r0, r2)
            java.util.List r0 = r3.zzd
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(r4, r1, r0, r2)
            java.util.List r0 = r3.zze
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(r4, r1, r0, r2)
            java.util.List r0 = r3.zzf
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(r4, r1, r0, r2)
            java.util.List r0 = r3.zzg
            r1 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
