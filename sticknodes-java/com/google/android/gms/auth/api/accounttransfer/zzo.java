package com.google.android.gms.auth.api.accounttransfer;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "AccountTransferMsgCreator")
/* loaded from: classes.dex */
public final class zzo extends com.google.android.gms.internal.auth.zzbz {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.accounttransfer.zzo> CREATOR = null;
    private static final java.util.HashMap zzc = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Indicator
    final java.util.Set zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    final int zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getAuthenticatorDatas", id = 2)
    private java.util.ArrayList zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getRequestType", id = 3)
    private int zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getProgress", id = 4)
    private com.google.android.gms.auth.api.accounttransfer.zzs zzf;

    static {
            com.google.android.gms.auth.api.accounttransfer.zzp r0 = new com.google.android.gms.auth.api.accounttransfer.zzp
            r0.<init>()
            com.google.android.gms.auth.api.accounttransfer.zzo.CREATOR = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.gms.auth.api.accounttransfer.zzo.zzc = r0
            java.lang.Class<com.google.android.gms.auth.api.accounttransfer.zzu> r1 = com.google.android.gms.auth.api.accounttransfer.zzu.class
            java.lang.String r2 = "authenticatorData"
            r3 = 2
            com.google.android.gms.common.server.response.FastJsonResponse$Field r1 = com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray(r2, r3, r1)
            r0.put(r2, r1)
            java.lang.Class<com.google.android.gms.auth.api.accounttransfer.zzs> r1 = com.google.android.gms.auth.api.accounttransfer.zzs.class
            java.lang.String r2 = "progress"
            r3 = 4
            com.google.android.gms.common.server.response.FastJsonResponse$Field r1 = com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType(r2, r3, r1)
            r0.put(r2, r1)
            return
    }

    public zzo() {
            r2 = this;
            r2.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 1
            r0.<init>(r1)
            r2.zza = r0
            r2.zzb = r1
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzo(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Indicator java.util.Set r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.util.ArrayList r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) com.google.android.gms.auth.api.accounttransfer.zzs r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzd = r3
            r0.zze = r4
            r0.zzf = r5
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field r3, java.lang.String r4, java.util.ArrayList r5) {
            r2 = this;
            int r3 = r3.getSafeParcelableFieldId()
            r4 = 2
            if (r3 != r4) goto L13
            r2.zzd = r5
            java.util.Set r4 = r2.zza
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.add(r3)
            return
        L13:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r1 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r1] = r3
            r3 = 1
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getCanonicalName()
            r4[r3] = r5
            java.lang.String r3 = "Field with id=%d is not a known ConcreteTypeArray type. Found %s"
            java.lang.String r3 = java.lang.String.format(r3, r4)
            r0.<init>(r3)
            throw r0
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field r3, java.lang.String r4, com.google.android.gms.common.server.response.FastJsonResponse r5) {
            r2 = this;
            int r3 = r3.getSafeParcelableFieldId()
            r4 = 4
            if (r3 != r4) goto L15
            com.google.android.gms.auth.api.accounttransfer.zzs r5 = (com.google.android.gms.auth.api.accounttransfer.zzs) r5
            r2.zzf = r5
            java.util.Set r4 = r2.zza
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.add(r3)
            return
        L15:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r1] = r3
            r3 = 1
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getCanonicalName()
            r0[r3] = r5
            java.lang.String r3 = "Field with id=%d is not a known custom type. Found %s"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            r4.<init>(r3)
            throw r4
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ java.util.Map getFieldMappings() {
            r1 = this;
            java.util.HashMap r0 = com.google.android.gms.auth.api.accounttransfer.zzo.zzc
            return r0
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final java.lang.Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field r4) {
            r3 = this;
            int r0 = r4.getSafeParcelableFieldId()
            r1 = 1
            if (r0 == r1) goto L2e
            r1 = 2
            if (r0 == r1) goto L2b
            r1 = 4
            if (r0 != r1) goto L10
            com.google.android.gms.auth.api.accounttransfer.zzs r4 = r3.zzf
            return r4
        L10:
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
        L2b:
            java.util.ArrayList r4 = r3.zzd
            return r4
        L2e:
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
            java.util.ArrayList r4 = r5.zzd
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r6, r3, r4, r2)
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
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L46
            com.google.android.gms.auth.api.accounttransfer.zzs r1 = r5.zzf
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r6, r3, r1, r7, r2)
        L46:
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r6, r0)
            return
    }
}
