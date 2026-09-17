package org.fortheloss.sticknodespro;

/* loaded from: classes2.dex */
public class AndroidLauncher extends org.fortheloss.androidcore.AndroidCore {
    private static final byte[] SALT = null;
    private int _afterCallbackSignIn;
    private com.google.android.gms.auth.api.signin.GoogleSignInClient _googleSignInClient;
    private float _scoreToSubmit;






    /* renamed from: -$$Nest$fget_afterCallbackSignIn, reason: not valid java name */
    static /* bridge */ /* synthetic */ int m1347$$Nest$fget_afterCallbackSignIn(org.fortheloss.sticknodespro.AndroidLauncher r0) {
            int r0 = r0._afterCallbackSignIn
            return r0
    }

    /* renamed from: -$$Nest$fget_scoreToSubmit, reason: not valid java name */
    static /* bridge */ /* synthetic */ float m1348$$Nest$fget_scoreToSubmit(org.fortheloss.sticknodespro.AndroidLauncher r0) {
            float r0 = r0._scoreToSubmit
            return r0
    }

    /* renamed from: -$$Nest$mactualMinigameDisplayLeaderboard, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1349$$Nest$mactualMinigameDisplayLeaderboard(org.fortheloss.sticknodespro.AndroidLauncher r0, com.google.android.gms.auth.api.signin.GoogleSignInAccount r1) {
            r0.actualMinigameDisplayLeaderboard(r1)
            return
    }

    /* renamed from: -$$Nest$mactualMinigameSubmitToLeaderboard, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m1350$$Nest$mactualMinigameSubmitToLeaderboard(org.fortheloss.sticknodespro.AndroidLauncher r0, com.google.android.gms.auth.api.signin.GoogleSignInAccount r1, float r2) {
            r0.actualMinigameSubmitToLeaderboard(r1, r2)
            return
    }

    static {
            r0 = 20
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [63, 60, 100, 39, -87, -81, 74, 99, 122, -100, 10, 48, 67, -50, 31, -103, -39, 55, 59, -44} // fill-array
            org.fortheloss.sticknodespro.AndroidLauncher.SALT = r0
            return
    }

    public AndroidLauncher() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._afterCallbackSignIn = r0
            r0 = 0
            r1._scoreToSubmit = r0
            return
    }

    private void actualMinigameDisplayLeaderboard(com.google.android.gms.auth.api.signin.GoogleSignInAccount r2) {
            r1 = this;
            com.google.android.gms.games.LeaderboardsClient r2 = com.google.android.gms.games.Games.getLeaderboardsClient(r1, r2)
            r0 = 2131558437(0x7f0d0025, float:1.874219E38)
            java.lang.String r0 = r1.getString(r0)
            com.google.android.gms.tasks.Task r2 = r2.getLeaderboardIntent(r0)
            org.fortheloss.sticknodespro.AndroidLauncher$3 r0 = new org.fortheloss.sticknodespro.AndroidLauncher$3
            r0.<init>(r1)
            com.google.android.gms.tasks.Task r2 = r2.addOnSuccessListener(r0)
            org.fortheloss.sticknodespro.AndroidLauncher$2 r0 = new org.fortheloss.sticknodespro.AndroidLauncher$2
            r0.<init>(r1)
            r2.addOnFailureListener(r0)
            return
    }

    private void actualMinigameSubmitToLeaderboard(com.google.android.gms.auth.api.signin.GoogleSignInAccount r5, float r6) {
            r4 = this;
            com.google.android.gms.games.LeaderboardsClient r0 = com.google.android.gms.games.Games.getLeaderboardsClient(r4, r5)
            r1 = 2131558437(0x7f0d0025, float:1.874219E38)
            java.lang.String r1 = r4.getString(r1)
            long r2 = (long) r6
            r0.submitScore(r1, r2)
            r4.actualMinigameDisplayLeaderboard(r5)
            return
    }

    private boolean checkPlayServices() {
            r3 = this;
            com.google.android.gms.common.GoogleApiAvailability r0 = com.google.android.gms.common.GoogleApiAvailability.getInstance()
            int r1 = r0.isGooglePlayServicesAvailable(r3)
            if (r1 == 0) goto L1a
            boolean r2 = r0.isUserResolvableError(r1)
            if (r2 == 0) goto L18
            org.fortheloss.sticknodespro.AndroidLauncher$4 r2 = new org.fortheloss.sticknodespro.AndroidLauncher$4
            r2.<init>(r3, r0, r1)
            r3.runOnUiThread(r2)
        L18:
            r0 = 0
            return r0
        L1a:
            r0 = 1
            return r0
    }

    @Override // org.fortheloss.androidcore.AndroidCore, org.fortheloss.framework.IPlatform
    public org.fortheloss.sticknodes.animationscreen.exporters.IPlatformMP4Encoder getPlatformMP4Encoder() {
            r4 = this;
            org.fortheloss.sticknodespro.AndroidColorFormatUtils$CodecInfo r0 = org.fortheloss.sticknodespro.AndroidColorFormatUtils.getColorFormatYUV()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r1 = r0.colorFormat
            java.lang.String r0 = r0.codecName
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.String r3 = "(Using Lollipop/Marshmellow MP4 encoder.)"
            r2.println(r3)
            org.fortheloss.sticknodespro.AndroidMP4EncoderLollipop r2 = new org.fortheloss.sticknodespro.AndroidMP4EncoderLollipop
            r2.<init>(r1, r0)
            return r2
    }

    public void licenseCallbackResult(boolean r2) {
            r1 = this;
            if (r2 != 0) goto L15
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.String r0 = "STICKNODES: Parroted app detected."
            r2.println(r0)
            r2 = 1
            org.fortheloss.sticknodes.App.isParroted = r2
            r1.loadInterstitialAd()
            java.lang.String r2 = "parroted_app_detected"
            r1.analyticsSendSingle(r2)
            goto L1f
        L15:
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.String r0 = "STICKNODES: Not parroted, as detected from license verification."
            r2.println(r0)
            r2 = 0
            org.fortheloss.sticknodes.App.isParroted = r2
        L1f:
            return
    }

    @Override // org.fortheloss.androidcore.AndroidCore, org.fortheloss.framework.IPlatform
    public void minigameDisplayLeaderboard() {
            r2 = this;
            boolean r0 = r2.checkPlayServices()
            r1 = 1
            if (r0 != r1) goto L35
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = com.google.android.gms.auth.api.signin.GoogleSignIn.getLastSignedInAccount(r2)
            if (r0 != 0) goto L32
            com.google.android.gms.auth.api.signin.GoogleSignInClient r0 = r2._googleSignInClient
            if (r0 != 0) goto L22
            com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder r0 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r1 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.DEFAULT_GAMES_SIGN_IN
            r0.<init>(r1)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = r0.build()
            com.google.android.gms.auth.api.signin.GoogleSignInClient r0 = com.google.android.gms.auth.api.signin.GoogleSignIn.getClient(r2, r0)
            r2._googleSignInClient = r0
        L22:
            com.google.android.gms.auth.api.signin.GoogleSignInClient r0 = r2._googleSignInClient
            android.content.Intent r0 = r0.getSignInIntent()
            r1 = 48305863(0x2e116c7, float:3.3073852E-37)
            r2.startActivityForResult(r0, r1)
            r0 = 0
            r2._afterCallbackSignIn = r0
            goto L35
        L32:
            r2.actualMinigameDisplayLeaderboard(r0)
        L35:
            return
    }

    @Override // org.fortheloss.androidcore.AndroidCore, org.fortheloss.framework.IPlatform
    public void minigameSubmitToLeaderboard(float r4) {
            r3 = this;
            boolean r0 = r3.checkPlayServices()
            r1 = 1
            if (r0 != r1) goto L36
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = com.google.android.gms.auth.api.signin.GoogleSignIn.getLastSignedInAccount(r3)
            if (r0 != 0) goto L33
            com.google.android.gms.auth.api.signin.GoogleSignInClient r0 = r3._googleSignInClient
            if (r0 != 0) goto L22
            com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder r0 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r2 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.DEFAULT_GAMES_SIGN_IN
            r0.<init>(r2)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = r0.build()
            com.google.android.gms.auth.api.signin.GoogleSignInClient r0 = com.google.android.gms.auth.api.signin.GoogleSignIn.getClient(r3, r0)
            r3._googleSignInClient = r0
        L22:
            com.google.android.gms.auth.api.signin.GoogleSignInClient r0 = r3._googleSignInClient
            android.content.Intent r0 = r0.getSignInIntent()
            r2 = 48305863(0x2e116c7, float:3.3073852E-37)
            r3.startActivityForResult(r0, r2)
            r3._afterCallbackSignIn = r1
            r3._scoreToSubmit = r4
            goto L36
        L33:
            r3.actualMinigameSubmitToLeaderboard(r0, r4)
        L36:
            return
    }

    @Override // org.fortheloss.androidcore.AndroidCore, org.fortheloss.framework.IPlatform
    public int mp3ToPCM(java.io.File r3, java.lang.String r4, int r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "-i '"
            r0.append(r1)
            java.lang.String r3 = r3.getAbsolutePath()
            r0.append(r3)
            java.lang.String r3 = "' -f s16le -acodec pcm_s16le -ac 2 -ar "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = " '"
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = "'"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.io.PrintStream r4 = java.lang.System.out
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "mp3ToPCM command: "
            r5.append(r0)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.println(r5)
            int r3 = com.arthenica.mobileffmpeg.FFmpeg.execute(r3)
            if (r3 != 0) goto L4f
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.String r4 = "Command execution completed successfully."
            r3.println(r4)
            r3 = 1
            return r3
        L4f:
            r4 = 255(0xff, float:3.57E-43)
            r5 = 0
            if (r3 != r4) goto L5c
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.String r4 = "Command execution cancelled by user."
            r3.println(r4)
            return r5
        L5c:
            java.io.PrintStream r4 = java.lang.System.out
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Command execution failed with rc="
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " and the output below."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.println(r3)
            r3 = 4
            com.arthenica.mobileffmpeg.Config.printLastCommandOutput(r3)
            return r5
    }

    @Override // org.fortheloss.androidcore.AndroidCore, com.badlogic.gdx.backends.android.AndroidApplication, android.app.Activity
    protected void onActivityResult(int r1, int r2, android.content.Intent r3) {
            r0 = this;
            super.onActivityResult(r1, r2, r3)
            r2 = 48305863(0x2e116c7, float:3.3073852E-37)
            if (r1 != r2) goto L12
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            org.fortheloss.sticknodespro.AndroidLauncher$5 r2 = new org.fortheloss.sticknodespro.AndroidLauncher$5
            r2.<init>(r0, r3)
            r1.postRunnable(r2)
        L12:
            return
    }

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle r7) {
            r6 = this;
            java.lang.String r1 = "TW9kIGJ5IExJVEVBUEtTICYgOU1PRC5DT00="
            r0 = 0
            byte[] r0 = android.util.Base64.decode(r1, r0)
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r6, r1, r0)
            r0.show()
            super.onCreate(r7)
            r7 = 2131558401(0x7f0d0001, float:1.8742117E38)
            java.lang.String r7 = r6.getString(r7)
            r0 = 1
            r6.initPlatform(r0, r7)
            android.content.Context r7 = r6.getContext()
            android.content.ContentResolver r7 = r7.getContentResolver()
            java.lang.String r0 = "android_id"
            java.lang.String r7 = android.provider.Settings.Secure.getString(r7, r0)
            android.content.pm.PackageManager r0 = r6.getPackageManager()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = r0.getInstallerPackageName(r1)
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "STICKNODES: Detecting parroted app with androidID of "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = " and installer package of "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = "."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.println(r2)
            if (r7 == 0) goto L93
            java.lang.String r1 = ""
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L93
            if (r0 == 0) goto L73
            java.lang.String r1 = "amazon"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L93
        L73:
            org.fortheloss.sticknodespro.MyLicenseCheckerCallback r0 = new org.fortheloss.sticknodespro.MyLicenseCheckerCallback
            r0.<init>(r6)
            com.google.android.vending.licensing.LicenseChecker r1 = new com.google.android.vending.licensing.LicenseChecker
            com.google.android.vending.licensing.ServerManagedPolicy r2 = new com.google.android.vending.licensing.ServerManagedPolicy
            com.google.android.vending.licensing.AESObfuscator r3 = new com.google.android.vending.licensing.AESObfuscator
            byte[] r4 = org.fortheloss.sticknodespro.AndroidLauncher.SALT
            java.lang.String r5 = r6.getPackageName()
            r3.<init>(r4, r5, r7)
            r2.<init>(r6, r3)
            java.lang.String r7 = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgFs7jp6ykGesVP+ChK21DLaf6rGtCSK7ac2NBdH4PCVtF3tyyC9LF43h7+QLPLZf8IZ+Dq8irEHjpB9yMD6ptTkrQ5n5ChfTjYEesAVjXrjBmXyG45vfQU2FIhafbCaFhBKc0QWd1Mou9dwjk2jrS4sGY+5xFK8S2ZsdLrgdK9oi4q9Da7voKCveEze2sN9p9iKjjk1RRv8RI0j5H/W9UjjB1Oe0pvLMdJImGwwJuVO9kD6fc0/XCkvi+CeOomfZHG6l29PMNYvQ95Fjefi9+I00A60jpXDq2pTgKADERRKa+Pi3hCGhh7Y0y6PGw2bLtREkMXLTmfV57xuHtR23LwIDAQAB"
            r1.<init>(r6, r2, r7)
            r1.checkAccess(r0)
            goto L9a
        L93:
            java.io.PrintStream r7 = java.lang.System.out
            java.lang.String r0 = "STICKNODES: Not parroted, as detected from installer package."
            r7.println(r0)
        L9a:
            r6.setupLibGDXApp()
            return
    }

    @Override // org.fortheloss.androidcore.AndroidCore, org.fortheloss.framework.IPlatform
    public void saveVideoToGallery(java.lang.String r17, org.fortheloss.framework.ISaveMediaToGalleryDelegate r18) {
            r16 = this;
            r1 = r16
            r2 = r18
            java.io.File r3 = new java.io.File
            r0 = r17
            r3.<init>(r0)
            java.lang.String r0 = r3.getName()
            java.lang.String r4 = r1.getFileNameWithoutExtension(r0)
            java.lang.String r0 = r1.getFileExtension(r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "_"
            r5.append(r4)
            long r6 = java.lang.System.currentTimeMillis()
            r5.append(r6)
            java.lang.String r4 = "."
            r5.append(r4)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r8 = "date_added"
            java.lang.String r9 = "video/mp4"
            java.lang.String r10 = "mime_type"
            java.lang.String r11 = "_display_name"
            java.lang.String r12 = "title"
            r14 = 29
            if (r5 < r14) goto L7b
            java.lang.String r15 = org.fortheloss.androidcore.AndroidCore.SN_DIR_MP4
            java.lang.String r13 = "relative_path"
            r4.put(r13, r15)
            r4.put(r12, r0)
            r4.put(r11, r0)
            r4.put(r10, r9)
            long r9 = java.lang.System.currentTimeMillis()
            long r9 = r9 / r6
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r4.put(r8, r0)
            java.lang.String r0 = "external_primary"
            android.net.Uri r0 = android.provider.MediaStore.Video.Media.getContentUri(r0)
            android.content.ContentResolver r6 = r16.getContentResolver()
            android.net.Uri r0 = r6.insert(r0, r4)
            r6 = r0
            r15 = 0
            goto Lcf
        L7b:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.io.File r15 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r15 = r15.getAbsolutePath()
            r13.append(r15)
            java.lang.String r15 = java.io.File.separator
            r13.append(r15)
            java.lang.String r15 = org.fortheloss.androidcore.AndroidCore.SN_DIR_MP4
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            java.io.File r15 = new java.io.File
            r15.<init>(r13)
            r15.mkdirs()
            java.io.File r15 = new java.io.File
            r15.<init>(r13, r0)
            r4.put(r12, r0)
            r4.put(r11, r0)
            r4.put(r10, r9)
            long r9 = java.lang.System.currentTimeMillis()
            long r9 = r9 / r6
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r4.put(r8, r0)
            java.lang.String r0 = r15.getAbsolutePath()
            java.lang.String r6 = "_data"
            r4.put(r6, r0)
            android.content.ContentResolver r0 = r16.getContentResolver()
            android.net.Uri r6 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            android.net.Uri r0 = r0.insert(r6, r4)
            r6 = r0
        Lcf:
            java.lang.String r7 = "is_pending"
            r8 = 1
            if (r5 < r14) goto Le8
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            java.lang.String r5 = "datetaken"
            r4.put(r5, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r4.put(r7, r0)
        Le8:
            r5 = 0
            android.content.ContentResolver r0 = r16.getContentResolver()     // Catch: java.lang.Exception -> L119
            java.lang.String r9 = "w"
            android.os.ParcelFileDescriptor r0 = r0.openFileDescriptor(r6, r9)     // Catch: java.lang.Exception -> L119
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L119
            java.io.FileDescriptor r10 = r0.getFileDescriptor()     // Catch: java.lang.Exception -> L119
            r9.<init>(r10)     // Catch: java.lang.Exception -> L119
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L119
            r10.<init>(r3)     // Catch: java.lang.Exception -> L119
            r11 = 8192(0x2000, float:1.14794E-41)
            byte[] r11 = new byte[r11]     // Catch: java.lang.Exception -> L119
        L105:
            int r12 = r10.read(r11)     // Catch: java.lang.Exception -> L119
            if (r12 <= 0) goto L10f
            r9.write(r11, r5, r12)     // Catch: java.lang.Exception -> L119
            goto L105
        L10f:
            r9.close()     // Catch: java.lang.Exception -> L119
            r10.close()     // Catch: java.lang.Exception -> L119
            r0.close()     // Catch: java.lang.Exception -> L119
            goto L11d
        L119:
            r0 = move-exception
            r0.printStackTrace()
        L11d:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r14) goto L133
            r4.clear()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.put(r7, r5)
            android.content.ContentResolver r5 = r16.getContentResolver()
            r7 = 0
            r5.update(r6, r4, r7, r7)
        L133:
            r3.delete()
            if (r2 == 0) goto L13b
            r2.success(r8)
        L13b:
            if (r0 >= r14) goto L153
            if (r15 == 0) goto L153
            boolean r0 = r15.exists()
            if (r0 != r8) goto L153
            android.content.Intent r0 = new android.content.Intent
            android.net.Uri r2 = android.net.Uri.fromFile(r15)
            java.lang.String r3 = "android.intent.action.MEDIA_SCANNER_SCAN_FILE"
            r0.<init>(r3, r2)
            r1.sendBroadcast(r0)
        L153:
            return
    }

    @Override // org.fortheloss.androidcore.AndroidCore, org.fortheloss.framework.IPlatform
    public void shareMP4(java.lang.String r4) {
            r3 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            r1[r2] = r4
            org.fortheloss.sticknodespro.AndroidLauncher$1 r4 = new org.fortheloss.sticknodespro.AndroidLauncher$1
            r4.<init>(r3, r0)
            r0 = 0
            android.media.MediaScannerConnection.scanFile(r3, r1, r0, r4)
            return
    }

    @Override // org.fortheloss.androidcore.AndroidCore, org.fortheloss.framework.IPlatform
    public int wavToAAC(java.io.File r4, java.lang.String r5) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "-i '"
            r0.append(r1)
            java.lang.String r4 = r4.getAbsolutePath()
            r0.append(r4)
            java.lang.String r4 = "' -strict -2 -ac 2 -ab 128000 -ar 44100 '"
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = "'"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.io.PrintStream r5 = java.lang.System.out
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "wavToAAC command: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r5.println(r0)
            int r4 = com.arthenica.mobileffmpeg.FFmpeg.execute(r4)
            if (r4 != 0) goto L47
            java.io.PrintStream r4 = java.lang.System.out
            java.lang.String r5 = "Command execution completed successfully."
            r4.println(r5)
            r4 = 1
            return r4
        L47:
            r5 = 255(0xff, float:3.57E-43)
            r0 = 0
            if (r4 != r5) goto L54
            java.io.PrintStream r4 = java.lang.System.out
            java.lang.String r5 = "Command execution cancelled by user."
            r4.println(r5)
            return r0
        L54:
            java.io.PrintStream r5 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Command execution failed with rc="
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " and the output below."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r5.println(r4)
            r4 = 4
            com.arthenica.mobileffmpeg.Config.printLastCommandOutput(r4)
            return r0
    }
}
