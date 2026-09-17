package com.google.android.gms.auth.api.signin;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "GoogleSignInAccountCreator")
@java.lang.Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> CREATOR = null;
    public static final com.google.android.gms.common.util.Clock zaa = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField(id = 1)
    final int zab;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 10)
    final java.util.List zac;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getId", id = 2)
    private final java.lang.String zad;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getIdToken", id = 3)
    private final java.lang.String zae;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getEmail", id = 4)
    private final java.lang.String zaf;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getDisplayName", id = 5)
    private final java.lang.String zag;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getPhotoUrl", id = 6)
    private final android.net.Uri zah;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getServerAuthCode", id = 7)
    private java.lang.String zai;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getExpirationTimeSecs", id = 8)
    private final long zaj;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getObfuscatedIdentifier", id = 9)
    private final java.lang.String zak;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getGivenName", id = 11)
    private final java.lang.String zal;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(getter = "getFamilyName", id = 12)
    private final java.lang.String zam;
    private final java.util.Set zan;

    static {
            com.google.android.gms.auth.api.signin.zab r0 = new com.google.android.gms.auth.api.signin.zab
            r0.<init>()
            com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR = r0
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.common.util.DefaultClock.getInstance()
            com.google.android.gms.auth.api.signin.GoogleSignInAccount.zaa = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    GoogleSignInAccount(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 1) int r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) java.lang.String r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) java.lang.String r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) java.lang.String r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) java.lang.String r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) android.net.Uri r7, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) java.lang.String r8, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 8) long r9, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) java.lang.String r11, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 10) java.util.List r12, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 11) java.lang.String r13, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 12) java.lang.String r14) {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.zan = r0
            r1.zab = r2
            r1.zad = r3
            r1.zae = r4
            r1.zaf = r5
            r1.zag = r6
            r1.zah = r7
            r1.zai = r8
            r1.zaj = r9
            r1.zak = r11
            r1.zac = r12
            r1.zal = r13
            r1.zam = r14
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount createDefault() {
            android.accounts.Account r0 = new android.accounts.Account
            java.lang.String r1 = "<<default account>>"
            java.lang.String r2 = "com.google"
            r0.<init>(r1, r2)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = zae(r0, r1)
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount fromAccount(android.accounts.Account r1) {
            androidx.collection.ArraySet r0 = new androidx.collection.ArraySet
            r0.<init>()
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = zae(r1, r0)
            return r1
    }

    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount fromAccountAndScopes(android.accounts.Account r1, com.google.android.gms.common.api.Scope r2, com.google.android.gms.common.api.Scope... r3) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r0.add(r2)
            java.util.List r2 = java.util.Arrays.asList(r3)
            r0.addAll(r2)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = zae(r1, r0)
            return r1
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount zaa(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, android.net.Uri r21, java.lang.Long r22, java.lang.String r23, java.util.Set r24) {
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r14 = new com.google.android.gms.auth.api.signin.GoogleSignInAccount
            long r8 = r22.longValue()
            java.lang.String r10 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r23)
            java.util.ArrayList r11 = new java.util.ArrayList
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r24)
            java.util.Collection r0 = (java.util.Collection) r0
            r11.<init>(r0)
            r1 = 3
            r7 = 0
            r0 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r21
            r12 = r19
            r13 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13)
            return r14
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount zab(java.lang.String r13) throws org.json.JSONException {
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r13)
            java.lang.String r13 = "photoUrl"
            java.lang.String r13 = r0.optString(r13)
            boolean r2 = android.text.TextUtils.isEmpty(r13)
            if (r2 != 0) goto L1f
            android.net.Uri r13 = android.net.Uri.parse(r13)
            r8 = r13
            goto L20
        L1f:
            r8 = r1
        L20:
            java.lang.String r13 = "expirationTime"
            java.lang.String r13 = r0.getString(r13)
            long r2 = java.lang.Long.parseLong(r13)
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            java.lang.String r13 = "grantedScopes"
            org.json.JSONArray r13 = r0.getJSONArray(r13)
            int r4 = r13.length()
            r5 = 0
        L3a:
            if (r5 >= r4) goto L4b
            com.google.android.gms.common.api.Scope r6 = new com.google.android.gms.common.api.Scope
            java.lang.String r7 = r13.getString(r5)
            r6.<init>(r7)
            r11.add(r6)
            int r5 = r5 + 1
            goto L3a
        L4b:
            java.lang.String r13 = "id"
            java.lang.String r13 = r0.optString(r13)
            java.lang.String r4 = "tokenId"
            boolean r5 = r0.has(r4)
            if (r5 == 0) goto L5e
            java.lang.String r4 = r0.optString(r4)
            goto L5f
        L5e:
            r4 = r1
        L5f:
            java.lang.String r5 = "email"
            boolean r6 = r0.has(r5)
            if (r6 == 0) goto L6c
            java.lang.String r5 = r0.optString(r5)
            goto L6d
        L6c:
            r5 = r1
        L6d:
            java.lang.String r6 = "displayName"
            boolean r7 = r0.has(r6)
            if (r7 == 0) goto L7a
            java.lang.String r6 = r0.optString(r6)
            goto L7b
        L7a:
            r6 = r1
        L7b:
            java.lang.String r7 = "givenName"
            boolean r9 = r0.has(r7)
            if (r9 == 0) goto L88
            java.lang.String r7 = r0.optString(r7)
            goto L89
        L88:
            r7 = r1
        L89:
            java.lang.String r9 = "familyName"
            boolean r10 = r0.has(r9)
            if (r10 == 0) goto L96
            java.lang.String r9 = r0.optString(r9)
            goto L97
        L96:
            r9 = r1
        L97:
            java.lang.Long r10 = java.lang.Long.valueOf(r2)
            java.lang.String r2 = "obfuscatedIdentifier"
            java.lang.String r12 = r0.getString(r2)
            r2 = r13
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r9
            r9 = r10
            r10 = r12
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r13 = zaa(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r2 = "serverAuthCode"
            boolean r3 = r0.has(r2)
            if (r3 == 0) goto Lb9
            java.lang.String r1 = r0.optString(r2)
        Lb9:
            r13.zai = r1
            return r13
    }

    private static com.google.android.gms.auth.api.signin.GoogleSignInAccount zae(android.accounts.Account r10, java.util.Set r11) {
            java.lang.String r2 = r10.name
            r0 = 0
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            java.lang.String r8 = r10.name
            r0 = 0
            r1 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r9 = r11
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r10 = zaa(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r5 != r4) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.auth.api.signin.GoogleSignInAccount
            if (r2 != 0) goto Ld
            return r0
        Ld:
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r5 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r5
            java.lang.String r2 = r5.zak
            java.lang.String r3 = r4.zak
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L28
            java.util.Set r5 = r5.getRequestedScopes()
            java.util.Set r2 = r4.getRequestedScopes()
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L28
            return r1
        L28:
            return r0
    }

    public android.accounts.Account getAccount() {
            r3 = this;
            java.lang.String r0 = r3.zaf
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            android.accounts.Account r1 = new android.accounts.Account
            java.lang.String r2 = "com.google"
            r1.<init>(r0, r2)
            return r1
    }

    public java.lang.String getDisplayName() {
            r1 = this;
            java.lang.String r0 = r1.zag
            return r0
    }

    public java.lang.String getEmail() {
            r1 = this;
            java.lang.String r0 = r1.zaf
            return r0
    }

    public java.lang.String getFamilyName() {
            r1 = this;
            java.lang.String r0 = r1.zam
            return r0
    }

    public java.lang.String getGivenName() {
            r1 = this;
            java.lang.String r0 = r1.zal
            return r0
    }

    public java.util.Set<com.google.android.gms.common.api.Scope> getGrantedScopes() {
            r2 = this;
            java.util.HashSet r0 = new java.util.HashSet
            java.util.List r1 = r2.zac
            r0.<init>(r1)
            return r0
    }

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.zad
            return r0
    }

    public java.lang.String getIdToken() {
            r1 = this;
            java.lang.String r0 = r1.zae
            return r0
    }

    public android.net.Uri getPhotoUrl() {
            r1 = this;
            android.net.Uri r0 = r1.zah
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public java.util.Set<com.google.android.gms.common.api.Scope> getRequestedScopes() {
            r2 = this;
            java.util.HashSet r0 = new java.util.HashSet
            java.util.List r1 = r2.zac
            r0.<init>(r1)
            java.util.Set r1 = r2.zan
            r0.addAll(r1)
            return r0
    }

    public java.lang.String getServerAuthCode() {
            r1 = this;
            java.lang.String r0 = r1.zai
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.zak
            int r0 = r0.hashCode()
            int r0 = r0 + 527
            java.util.Set r1 = r2.getRequestedScopes()
            int r1 = r1.hashCode()
            int r0 = r0 * 31
            int r0 = r0 + r1
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean isExpired() {
            r6 = this;
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.zaa
            long r0 = r0.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            long r2 = r6.zaj
            r4 = -300(0xfffffffffffffed4, double:NaN)
            long r2 = r2 + r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.auth.api.signin.GoogleSignInAccount requestExtraScopes(com.google.android.gms.common.api.Scope... r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.Set r0 = r1.zan
            java.util.Collections.addAll(r0, r2)
        L7:
            return r1
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            int r1 = r4.zab
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r1)
            java.lang.String r1 = r4.getId()
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            java.lang.String r1 = r4.getIdToken()
            r2 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            java.lang.String r1 = r4.getEmail()
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            java.lang.String r1 = r4.getDisplayName()
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r1, r3)
            android.net.Uri r1 = r4.getPhotoUrl()
            r2 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            java.lang.String r6 = r4.getServerAuthCode()
            r1 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            long r1 = r4.zaj
            r6 = 8
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r5, r6, r1)
            java.lang.String r6 = r4.zak
            r1 = 9
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            java.util.List r6 = r4.zac
            r1 = 10
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r5, r1, r6, r3)
            java.lang.String r6 = r4.getGivenName()
            r1 = 11
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            java.lang.String r6 = r4.getFamilyName()
            r1 = 12
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    public final java.lang.String zac() {
            r1 = this;
            java.lang.String r0 = r1.zak
            return r0
    }

    public final java.lang.String zad() {
            r7 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r7.getId()     // Catch: org.json.JSONException -> Lc0
            if (r1 == 0) goto L14
            java.lang.String r1 = "id"
            java.lang.String r2 = r7.getId()     // Catch: org.json.JSONException -> Lc0
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Lc0
        L14:
            java.lang.String r1 = r7.getIdToken()     // Catch: org.json.JSONException -> Lc0
            if (r1 == 0) goto L23
            java.lang.String r1 = "tokenId"
            java.lang.String r2 = r7.getIdToken()     // Catch: org.json.JSONException -> Lc0
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Lc0
        L23:
            java.lang.String r1 = r7.getEmail()     // Catch: org.json.JSONException -> Lc0
            if (r1 == 0) goto L32
            java.lang.String r1 = "email"
            java.lang.String r2 = r7.getEmail()     // Catch: org.json.JSONException -> Lc0
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Lc0
        L32:
            java.lang.String r1 = r7.getDisplayName()     // Catch: org.json.JSONException -> Lc0
            if (r1 == 0) goto L41
            java.lang.String r1 = "displayName"
            java.lang.String r2 = r7.getDisplayName()     // Catch: org.json.JSONException -> Lc0
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Lc0
        L41:
            java.lang.String r1 = r7.getGivenName()     // Catch: org.json.JSONException -> Lc0
            if (r1 == 0) goto L50
            java.lang.String r1 = "givenName"
            java.lang.String r2 = r7.getGivenName()     // Catch: org.json.JSONException -> Lc0
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Lc0
        L50:
            java.lang.String r1 = r7.getFamilyName()     // Catch: org.json.JSONException -> Lc0
            if (r1 == 0) goto L5f
            java.lang.String r1 = "familyName"
            java.lang.String r2 = r7.getFamilyName()     // Catch: org.json.JSONException -> Lc0
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Lc0
        L5f:
            android.net.Uri r1 = r7.getPhotoUrl()     // Catch: org.json.JSONException -> Lc0
            if (r1 == 0) goto L6e
            java.lang.String r2 = "photoUrl"
            java.lang.String r1 = r1.toString()     // Catch: org.json.JSONException -> Lc0
            r0.put(r2, r1)     // Catch: org.json.JSONException -> Lc0
        L6e:
            java.lang.String r1 = r7.getServerAuthCode()     // Catch: org.json.JSONException -> Lc0
            java.lang.String r2 = "serverAuthCode"
            if (r1 == 0) goto L7d
            java.lang.String r1 = r7.getServerAuthCode()     // Catch: org.json.JSONException -> Lc0
            r0.put(r2, r1)     // Catch: org.json.JSONException -> Lc0
        L7d:
            java.lang.String r1 = "expirationTime"
            long r3 = r7.zaj     // Catch: org.json.JSONException -> Lc0
            r0.put(r1, r3)     // Catch: org.json.JSONException -> Lc0
            java.lang.String r1 = "obfuscatedIdentifier"
            java.lang.String r3 = r7.zak     // Catch: org.json.JSONException -> Lc0
            r0.put(r1, r3)     // Catch: org.json.JSONException -> Lc0
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: org.json.JSONException -> Lc0
            r1.<init>()     // Catch: org.json.JSONException -> Lc0
            java.util.List r3 = r7.zac     // Catch: org.json.JSONException -> Lc0
            int r4 = r3.size()     // Catch: org.json.JSONException -> Lc0
            com.google.android.gms.common.api.Scope[] r4 = new com.google.android.gms.common.api.Scope[r4]     // Catch: org.json.JSONException -> Lc0
            java.lang.Object[] r3 = r3.toArray(r4)     // Catch: org.json.JSONException -> Lc0
            com.google.android.gms.common.api.Scope[] r3 = (com.google.android.gms.common.api.Scope[]) r3     // Catch: org.json.JSONException -> Lc0
            com.google.android.gms.auth.api.signin.zaa r4 = com.google.android.gms.auth.api.signin.zaa.zaa     // Catch: org.json.JSONException -> Lc0
            java.util.Arrays.sort(r3, r4)     // Catch: org.json.JSONException -> Lc0
            int r4 = r3.length     // Catch: org.json.JSONException -> Lc0
            r5 = 0
        La5:
            if (r5 >= r4) goto Lb3
            r6 = r3[r5]     // Catch: org.json.JSONException -> Lc0
            java.lang.String r6 = r6.getScopeUri()     // Catch: org.json.JSONException -> Lc0
            r1.put(r6)     // Catch: org.json.JSONException -> Lc0
            int r5 = r5 + 1
            goto La5
        Lb3:
            java.lang.String r3 = "grantedScopes"
            r0.put(r3, r1)     // Catch: org.json.JSONException -> Lc0
            r0.remove(r2)
            java.lang.String r0 = r0.toString()
            return r0
        Lc0:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }
}
