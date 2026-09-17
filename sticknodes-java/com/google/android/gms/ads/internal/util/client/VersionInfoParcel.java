package com.google.android.gms.ads.internal.util.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "VersionInfoParcelCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class VersionInfoParcel extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.ads.internal.util.client.VersionInfoParcel> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    public java.lang.String afmaVersion;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    public int buddyApkVersion;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    public int clientJarVersion;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    public boolean isClientJar;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 6)
    public boolean isLiteSdk;

    static {
            com.google.android.gms.ads.internal.util.client.zzs r0 = new com.google.android.gms.ads.internal.util.client.zzs
            r0.<init>()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel.CREATOR = r0
            return
    }

    public VersionInfoParcel(int r7, int r8, boolean r9) {
            r6 = this;
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public VersionInfoParcel(int r7, int r8, boolean r9, boolean r10) {
            r6 = this;
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public VersionInfoParcel(int r9, int r10, boolean r11, boolean r12, boolean r13) {
            r8 = this;
            if (r11 == 0) goto L5
            java.lang.String r12 = "0"
            goto Lc
        L5:
            if (r12 == 0) goto La
            java.lang.String r12 = "2"
            goto Lc
        La:
            java.lang.String r12 = "1"
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "afma-sdk-a-v"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = "."
            r0.append(r1)
            r0.append(r10)
            r0.append(r1)
            r0.append(r12)
            java.lang.String r3 = r0.toString()
            r2 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    VersionInfoParcel(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) int r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) boolean r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) boolean r5) {
            r0 = this;
            r0.<init>()
            r0.afmaVersion = r1
            r0.buddyApkVersion = r2
            r0.clientJarVersion = r3
            r0.isClientJar = r4
            r0.isLiteSdk = r5
            return
    }

    public static com.google.android.gms.ads.internal.util.client.VersionInfoParcel forPackage() {
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = new com.google.android.gms.ads.internal.util.client.VersionInfoParcel
            r1 = 12451000(0xbdfcb8, float:1.7447567E-38)
            r2 = 1
            r0.<init>(r1, r1, r2)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            java.lang.String r0 = r3.afmaVersion
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r0, r2)
            int r0 = r3.buddyApkVersion
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            int r0 = r3.clientJarVersion
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r0)
            boolean r0 = r3.isClientJar
            r1 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r0)
            boolean r0 = r3.isLiteSdk
            r1 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r1, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }
}
