package com.google.android.gms.auth.api.accounttransfer;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "DeviceMetaDataCreator")
/* loaded from: classes.dex */
public class DeviceMetaData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.accounttransfer.DeviceMetaData> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    final int zza;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isLockScreenSolved", id = 2)
    private final boolean zzb;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getMinAgeOfLockScreen", id = 3)
    private final long zzc;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "isChallengeAllowed", id = 4)
    private final boolean zzd;

    static {
            com.google.android.gms.auth.api.accounttransfer.zzy r0 = new com.google.android.gms.auth.api.accounttransfer.zzy
            r0.<init>()
            com.google.android.gms.auth.api.accounttransfer.DeviceMetaData.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    DeviceMetaData(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) boolean r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) long r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) boolean r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r5
            return
    }

    public long getMinAgeOfLockScreen() {
            r2 = this;
            long r0 = r2.zzc
            return r0
    }

    public boolean isChallengeAllowed() {
            r1 = this;
            boolean r0 = r1.zzd
            return r0
    }

    public boolean isLockScreenSolved() {
            r1 = this;
            boolean r0 = r1.zzb
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            int r0 = r3.zza
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            boolean r0 = r3.isLockScreenSolved()
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r0)
            long r0 = r3.getMinAgeOfLockScreen()
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r2, r0)
            boolean r0 = r3.isChallengeAllowed()
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
