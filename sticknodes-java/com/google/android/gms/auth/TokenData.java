package com.google.android.gms.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "TokenDataCreator")
/* loaded from: classes.dex */
public class TokenData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.TokenData> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    final int zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getToken", id = 2)
    private final java.lang.String zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getExpirationTimeSecs", id = 3)
    private final java.lang.Long zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isCached", id = 4)
    private final boolean zzd;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isSnowballed", id = 5)
    private final boolean zze;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getGrantedScopes", id = 6)
    private final java.util.List zzf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getScopeData", id = 7)
    private final java.lang.String zzg;

    static {
            com.google.android.gms.auth.zzm r0 = new com.google.android.gms.auth.zzm
            r0.<init>()
            com.google.android.gms.auth.TokenData.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    TokenData(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.Long r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) boolean r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) boolean r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) java.util.List r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) java.lang.String r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            java.lang.String r1 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)
            r0.zzb = r1
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.auth.TokenData
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.auth.TokenData r4 = (com.google.android.gms.auth.TokenData) r4
            java.lang.String r0 = r3.zzb
            java.lang.String r2 = r4.zzb
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L3e
            java.lang.Long r0 = r3.zzc
            java.lang.Long r2 = r4.zzc
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L3e
            boolean r0 = r3.zzd
            boolean r2 = r4.zzd
            if (r0 != r2) goto L3e
            boolean r0 = r3.zze
            boolean r2 = r4.zze
            if (r0 != r2) goto L3e
            java.util.List r0 = r3.zzf
            java.util.List r2 = r4.zzf
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L3e
            java.lang.String r0 = r3.zzg
            java.lang.String r4 = r4.zzg
            boolean r4 = com.google.android.gms.common.internal.Objects.equal(r0, r4)
            if (r4 == 0) goto L3e
            r4 = 1
            return r4
        L3e:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            r0 = 6
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.zzb
            r2 = 0
            r0[r2] = r1
            java.lang.Long r1 = r3.zzc
            r2 = 1
            r0[r2] = r1
            boolean r1 = r3.zzd
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            boolean r1 = r3.zze
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 3
            r0[r2] = r1
            java.util.List r1 = r3.zzf
            r2 = 4
            r0[r2] = r1
            java.lang.String r1 = r3.zzg
            r2 = 5
            r0[r2] = r1
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            int r0 = r3.zza
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            java.lang.String r0 = r3.zzb
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            java.lang.Long r0 = r3.zzc
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongObject(r4, r1, r0, r2)
            boolean r0 = r3.zzd
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r0)
            boolean r0 = r3.zze
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r0)
            java.util.List r0 = r3.zzf
            r1 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(r4, r1, r0, r2)
            java.lang.String r0 = r3.zzg
            r1 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }

    public final java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }
}
