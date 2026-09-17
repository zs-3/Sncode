package androidx.core.app;

/* loaded from: classes.dex */
class NotificationCompatBuilder implements androidx.core.app.NotificationBuilderWithBuilderAccessor {
    private final java.util.List<android.os.Bundle> mActionExtrasList;
    private android.widget.RemoteViews mBigContentView;
    private final android.app.Notification.Builder mBuilder;
    private final androidx.core.app.NotificationCompat.Builder mBuilderCompat;
    private android.widget.RemoteViews mContentView;
    private final android.content.Context mContext;
    private final android.os.Bundle mExtras;
    private int mGroupAlertBehavior;
    private android.widget.RemoteViews mHeadsUpContentView;

    NotificationCompatBuilder(androidx.core.app.NotificationCompat.Builder r14) {
            r13 = this;
            r13.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r13.mActionExtrasList = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r13.mExtras = r0
            r13.mBuilderCompat = r14
            android.content.Context r0 = r14.mContext
            r13.mContext = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L29
            android.app.Notification$Builder r0 = new android.app.Notification$Builder
            android.content.Context r2 = r14.mContext
            java.lang.String r3 = r14.mChannelId
            r0.<init>(r2, r3)
            r13.mBuilder = r0
            goto L32
        L29:
            android.app.Notification$Builder r0 = new android.app.Notification$Builder
            android.content.Context r2 = r14.mContext
            r0.<init>(r2)
            r13.mBuilder = r0
        L32:
            android.app.Notification r0 = r14.mNotification
            android.app.Notification$Builder r2 = r13.mBuilder
            long r3 = r0.when
            android.app.Notification$Builder r2 = r2.setWhen(r3)
            int r3 = r0.icon
            int r4 = r0.iconLevel
            android.app.Notification$Builder r2 = r2.setSmallIcon(r3, r4)
            android.widget.RemoteViews r3 = r0.contentView
            android.app.Notification$Builder r2 = r2.setContent(r3)
            java.lang.CharSequence r3 = r0.tickerText
            android.widget.RemoteViews r4 = r14.mTickerView
            android.app.Notification$Builder r2 = r2.setTicker(r3, r4)
            long[] r3 = r0.vibrate
            android.app.Notification$Builder r2 = r2.setVibrate(r3)
            int r3 = r0.ledARGB
            int r4 = r0.ledOnMS
            int r5 = r0.ledOffMS
            android.app.Notification$Builder r2 = r2.setLights(r3, r4, r5)
            int r3 = r0.flags
            r4 = 2
            r3 = r3 & r4
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L6c
            r3 = 1
            goto L6d
        L6c:
            r3 = 0
        L6d:
            android.app.Notification$Builder r2 = r2.setOngoing(r3)
            int r3 = r0.flags
            r3 = r3 & 8
            if (r3 == 0) goto L79
            r3 = 1
            goto L7a
        L79:
            r3 = 0
        L7a:
            android.app.Notification$Builder r2 = r2.setOnlyAlertOnce(r3)
            int r3 = r0.flags
            r3 = r3 & 16
            if (r3 == 0) goto L86
            r3 = 1
            goto L87
        L86:
            r3 = 0
        L87:
            android.app.Notification$Builder r2 = r2.setAutoCancel(r3)
            int r3 = r0.defaults
            android.app.Notification$Builder r2 = r2.setDefaults(r3)
            java.lang.CharSequence r3 = r14.mContentTitle
            android.app.Notification$Builder r2 = r2.setContentTitle(r3)
            java.lang.CharSequence r3 = r14.mContentText
            android.app.Notification$Builder r2 = r2.setContentText(r3)
            java.lang.CharSequence r3 = r14.mContentInfo
            android.app.Notification$Builder r2 = r2.setContentInfo(r3)
            android.app.PendingIntent r3 = r14.mContentIntent
            android.app.Notification$Builder r2 = r2.setContentIntent(r3)
            android.app.PendingIntent r3 = r0.deleteIntent
            android.app.Notification$Builder r2 = r2.setDeleteIntent(r3)
            android.app.PendingIntent r3 = r14.mFullScreenIntent
            int r7 = r0.flags
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto Lb9
            r7 = 1
            goto Lba
        Lb9:
            r7 = 0
        Lba:
            android.app.Notification$Builder r2 = r2.setFullScreenIntent(r3, r7)
            android.graphics.Bitmap r3 = r14.mLargeIcon
            android.app.Notification$Builder r2 = r2.setLargeIcon(r3)
            int r3 = r14.mNumber
            android.app.Notification$Builder r2 = r2.setNumber(r3)
            int r3 = r14.mProgressMax
            int r7 = r14.mProgress
            boolean r8 = r14.mProgressIndeterminate
            r2.setProgress(r3, r7, r8)
            android.app.Notification$Builder r2 = r13.mBuilder
            java.lang.CharSequence r3 = r14.mSubText
            android.app.Notification$Builder r2 = r2.setSubText(r3)
            boolean r3 = r14.mUseChronometer
            android.app.Notification$Builder r2 = r2.setUsesChronometer(r3)
            int r3 = r14.mPriority
            r2.setPriority(r3)
            java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r2 = r14.mActions
            java.util.Iterator r2 = r2.iterator()
        Lec:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lfc
            java.lang.Object r3 = r2.next()
            androidx.core.app.NotificationCompat$Action r3 = (androidx.core.app.NotificationCompat.Action) r3
            r13.addAction(r3)
            goto Lec
        Lfc:
            android.os.Bundle r2 = r14.mExtras
            if (r2 == 0) goto L105
            android.os.Bundle r3 = r13.mExtras
            r3.putAll(r2)
        L105:
            int r2 = android.os.Build.VERSION.SDK_INT
            android.widget.RemoteViews r3 = r14.mContentView
            r13.mContentView = r3
            android.widget.RemoteViews r3 = r14.mBigContentView
            r13.mBigContentView = r3
            android.app.Notification$Builder r3 = r13.mBuilder
            boolean r7 = r14.mShowWhen
            r3.setShowWhen(r7)
            android.app.Notification$Builder r3 = r13.mBuilder
            boolean r7 = r14.mLocalOnly
            android.app.Notification$Builder r3 = r3.setLocalOnly(r7)
            java.lang.String r7 = r14.mGroupKey
            android.app.Notification$Builder r3 = r3.setGroup(r7)
            boolean r7 = r14.mGroupSummary
            android.app.Notification$Builder r3 = r3.setGroupSummary(r7)
            java.lang.String r7 = r14.mSortKey
            r3.setSortKey(r7)
            int r3 = r14.mGroupAlertBehavior
            r13.mGroupAlertBehavior = r3
            android.app.Notification$Builder r3 = r13.mBuilder
            java.lang.String r7 = r14.mCategory
            android.app.Notification$Builder r3 = r3.setCategory(r7)
            int r7 = r14.mColor
            android.app.Notification$Builder r3 = r3.setColor(r7)
            int r7 = r14.mVisibility
            android.app.Notification$Builder r3 = r3.setVisibility(r7)
            android.app.Notification r7 = r14.mPublicVersion
            android.app.Notification$Builder r3 = r3.setPublicVersion(r7)
            android.net.Uri r7 = r0.sound
            android.media.AudioAttributes r8 = r0.audioAttributes
            r3.setSound(r7, r8)
            r3 = 28
            if (r2 >= r3) goto L165
            java.util.ArrayList<androidx.core.app.Person> r2 = r14.mPersonList
            java.util.List r2 = getPeople(r2)
            java.util.ArrayList<java.lang.String> r7 = r14.mPeople
            java.util.List r2 = combineLists(r2, r7)
            goto L167
        L165:
            java.util.ArrayList<java.lang.String> r2 = r14.mPeople
        L167:
            if (r2 == 0) goto L185
            boolean r7 = r2.isEmpty()
            if (r7 != 0) goto L185
            java.util.Iterator r2 = r2.iterator()
        L173:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L185
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            android.app.Notification$Builder r8 = r13.mBuilder
            r8.addPerson(r7)
            goto L173
        L185:
            android.widget.RemoteViews r2 = r14.mHeadsUpContentView
            r13.mHeadsUpContentView = r2
            java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r2 = r14.mInvisibleActions
            int r2 = r2.size()
            if (r2 <= 0) goto L1df
            android.os.Bundle r2 = r14.getExtras()
            java.lang.String r7 = "android.car.EXTENSIONS"
            android.os.Bundle r2 = r2.getBundle(r7)
            if (r2 != 0) goto L1a2
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
        L1a2:
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>(r2)
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            r10 = 0
        L1ad:
            java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r11 = r14.mInvisibleActions
            int r11 = r11.size()
            if (r10 >= r11) goto L1cb
            java.lang.String r11 = java.lang.Integer.toString(r10)
            java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r12 = r14.mInvisibleActions
            java.lang.Object r12 = r12.get(r10)
            androidx.core.app.NotificationCompat$Action r12 = (androidx.core.app.NotificationCompat.Action) r12
            android.os.Bundle r12 = androidx.core.app.NotificationCompatJellybean.getBundleForAction(r12)
            r9.putBundle(r11, r12)
            int r10 = r10 + 1
            goto L1ad
        L1cb:
            java.lang.String r10 = "invisible_actions"
            r2.putBundle(r10, r9)
            r8.putBundle(r10, r9)
            android.os.Bundle r9 = r14.getExtras()
            r9.putBundle(r7, r2)
            android.os.Bundle r2 = r13.mExtras
            r2.putBundle(r7, r8)
        L1df:
            int r2 = android.os.Build.VERSION.SDK_INT
            r7 = 23
            if (r2 < r7) goto L1ee
            android.graphics.drawable.Icon r7 = r14.mSmallIcon
            if (r7 == 0) goto L1ee
            android.app.Notification$Builder r8 = r13.mBuilder
            r8.setSmallIcon(r7)
        L1ee:
            r7 = 24
            if (r2 < r7) goto L21a
            android.app.Notification$Builder r7 = r13.mBuilder
            android.os.Bundle r8 = r14.mExtras
            android.app.Notification$Builder r7 = r7.setExtras(r8)
            java.lang.CharSequence[] r8 = r14.mRemoteInputHistory
            r7.setRemoteInputHistory(r8)
            android.widget.RemoteViews r7 = r14.mContentView
            if (r7 == 0) goto L208
            android.app.Notification$Builder r8 = r13.mBuilder
            r8.setCustomContentView(r7)
        L208:
            android.widget.RemoteViews r7 = r14.mBigContentView
            if (r7 == 0) goto L211
            android.app.Notification$Builder r8 = r13.mBuilder
            r8.setCustomBigContentView(r7)
        L211:
            android.widget.RemoteViews r7 = r14.mHeadsUpContentView
            if (r7 == 0) goto L21a
            android.app.Notification$Builder r8 = r13.mBuilder
            r8.setCustomHeadsUpContentView(r7)
        L21a:
            r7 = 0
            if (r2 < r1) goto L260
            android.app.Notification$Builder r8 = r13.mBuilder
            int r9 = r14.mBadgeIcon
            android.app.Notification$Builder r8 = r8.setBadgeIconType(r9)
            java.lang.CharSequence r9 = r14.mSettingsText
            android.app.Notification$Builder r8 = r8.setSettingsText(r9)
            java.lang.String r9 = r14.mShortcutId
            android.app.Notification$Builder r8 = r8.setShortcutId(r9)
            long r9 = r14.mTimeout
            android.app.Notification$Builder r8 = r8.setTimeoutAfter(r9)
            int r9 = r14.mGroupAlertBehavior
            r8.setGroupAlertBehavior(r9)
            boolean r8 = r14.mColorizedSet
            if (r8 == 0) goto L247
            android.app.Notification$Builder r8 = r13.mBuilder
            boolean r9 = r14.mColorized
            r8.setColorized(r9)
        L247:
            java.lang.String r8 = r14.mChannelId
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L260
            android.app.Notification$Builder r8 = r13.mBuilder
            android.app.Notification$Builder r8 = r8.setSound(r7)
            android.app.Notification$Builder r8 = r8.setDefaults(r6)
            android.app.Notification$Builder r6 = r8.setLights(r6, r6, r6)
            r6.setVibrate(r7)
        L260:
            if (r2 < r3) goto L27e
            java.util.ArrayList<androidx.core.app.Person> r2 = r14.mPersonList
            java.util.Iterator r2 = r2.iterator()
        L268:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L27e
            java.lang.Object r3 = r2.next()
            androidx.core.app.Person r3 = (androidx.core.app.Person) r3
            android.app.Notification$Builder r6 = r13.mBuilder
            android.app.Person r3 = r3.toAndroidPerson()
            r6.addPerson(r3)
            goto L268
        L27e:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 < r3) goto L294
            android.app.Notification$Builder r3 = r13.mBuilder
            boolean r6 = r14.mAllowSystemGeneratedContextualActions
            r3.setAllowSystemGeneratedContextualActions(r6)
            android.app.Notification$Builder r3 = r13.mBuilder
            android.app.Notification$BubbleMetadata r6 = androidx.core.app.NotificationCompat.BubbleMetadata.toPlatform(r7)
            r3.setBubbleMetadata(r6)
        L294:
            r3 = 31
            if (r2 < r3) goto L2a1
            int r3 = r14.mFgsDeferBehavior
            if (r3 == 0) goto L2a1
            android.app.Notification$Builder r6 = r13.mBuilder
            r6.setForegroundServiceBehavior(r3)
        L2a1:
            boolean r14 = r14.mSilent
            if (r14 == 0) goto L2e1
            androidx.core.app.NotificationCompat$Builder r14 = r13.mBuilderCompat
            boolean r14 = r14.mGroupSummary
            if (r14 == 0) goto L2ae
            r13.mGroupAlertBehavior = r4
            goto L2b0
        L2ae:
            r13.mGroupAlertBehavior = r5
        L2b0:
            android.app.Notification$Builder r14 = r13.mBuilder
            r14.setVibrate(r7)
            android.app.Notification$Builder r14 = r13.mBuilder
            r14.setSound(r7)
            int r14 = r0.defaults
            r14 = r14 & (-2)
            r14 = r14 & (-3)
            r0.defaults = r14
            android.app.Notification$Builder r0 = r13.mBuilder
            r0.setDefaults(r14)
            if (r2 < r1) goto L2e1
            androidx.core.app.NotificationCompat$Builder r14 = r13.mBuilderCompat
            java.lang.String r14 = r14.mGroupKey
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 == 0) goto L2da
            android.app.Notification$Builder r14 = r13.mBuilder
            java.lang.String r0 = "silent"
            r14.setGroup(r0)
        L2da:
            android.app.Notification$Builder r14 = r13.mBuilder
            int r0 = r13.mGroupAlertBehavior
            r14.setGroupAlertBehavior(r0)
        L2e1:
            return
    }

    private void addAction(androidx.core.app.NotificationCompat.Action r6) {
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            androidx.core.graphics.drawable.IconCompat r1 = r6.getIconCompat()
            r2 = 23
            r3 = 0
            if (r0 < r2) goto L21
            android.app.Notification$Action$Builder r0 = new android.app.Notification$Action$Builder
            if (r1 == 0) goto L14
            android.graphics.drawable.Icon r1 = r1.toIcon()
            goto L15
        L14:
            r1 = 0
        L15:
            java.lang.CharSequence r2 = r6.getTitle()
            android.app.PendingIntent r4 = r6.getActionIntent()
            r0.<init>(r1, r2, r4)
            goto L36
        L21:
            android.app.Notification$Action$Builder r0 = new android.app.Notification$Action$Builder
            if (r1 == 0) goto L2a
            int r1 = r1.getResId()
            goto L2b
        L2a:
            r1 = 0
        L2b:
            java.lang.CharSequence r2 = r6.getTitle()
            android.app.PendingIntent r4 = r6.getActionIntent()
            r0.<init>(r1, r2, r4)
        L36:
            androidx.core.app.RemoteInput[] r1 = r6.getRemoteInputs()
            if (r1 == 0) goto L4f
            androidx.core.app.RemoteInput[] r1 = r6.getRemoteInputs()
            android.app.RemoteInput[] r1 = androidx.core.app.RemoteInput.fromCompat(r1)
            int r2 = r1.length
        L45:
            if (r3 >= r2) goto L4f
            r4 = r1[r3]
            r0.addRemoteInput(r4)
            int r3 = r3 + 1
            goto L45
        L4f:
            android.os.Bundle r1 = r6.getExtras()
            if (r1 == 0) goto L5f
            android.os.Bundle r1 = new android.os.Bundle
            android.os.Bundle r2 = r6.getExtras()
            r1.<init>(r2)
            goto L64
        L5f:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
        L64:
            boolean r2 = r6.getAllowGeneratedReplies()
            java.lang.String r3 = "android.support.allowGeneratedReplies"
            r1.putBoolean(r3, r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L7a
            boolean r3 = r6.getAllowGeneratedReplies()
            r0.setAllowGeneratedReplies(r3)
        L7a:
            int r3 = r6.getSemanticAction()
            java.lang.String r4 = "android.support.action.semanticAction"
            r1.putInt(r4, r3)
            r3 = 28
            if (r2 < r3) goto L8e
            int r3 = r6.getSemanticAction()
            r0.setSemanticAction(r3)
        L8e:
            r3 = 29
            if (r2 < r3) goto L99
            boolean r3 = r6.isContextual()
            r0.setContextual(r3)
        L99:
            r3 = 31
            if (r2 < r3) goto La4
            boolean r2 = r6.isAuthenticationRequired()
            r0.setAuthenticationRequired(r2)
        La4:
            boolean r6 = r6.getShowsUserInterface()
            java.lang.String r2 = "android.support.action.showsUserInterface"
            r1.putBoolean(r2, r6)
            r0.addExtras(r1)
            android.app.Notification$Builder r6 = r5.mBuilder
            android.app.Notification$Action r0 = r0.build()
            r6.addAction(r0)
            return
    }

    private static java.util.List<java.lang.String> combineLists(java.util.List<java.lang.String> r3, java.util.List<java.lang.String> r4) {
            if (r3 != 0) goto L3
            return r4
        L3:
            if (r4 != 0) goto L6
            return r3
        L6:
            androidx.collection.ArraySet r0 = new androidx.collection.ArraySet
            int r1 = r3.size()
            int r2 = r4.size()
            int r1 = r1 + r2
            r0.<init>(r1)
            r0.addAll(r3)
            r0.addAll(r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            return r3
    }

    private static java.util.List<java.lang.String> getPeople(java.util.List<androidx.core.app.Person> r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L11:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r2.next()
            androidx.core.app.Person r1 = (androidx.core.app.Person) r1
            java.lang.String r1 = r1.resolveToLegacyUri()
            r0.add(r1)
            goto L11
        L25:
            return r0
    }

    private void removeSoundAndVibration(android.app.Notification r2) {
            r1 = this;
            r0 = 0
            r2.sound = r0
            r2.vibrate = r0
            int r0 = r2.defaults
            r0 = r0 & (-2)
            r0 = r0 & (-3)
            r2.defaults = r0
            return
    }

    public android.app.Notification build() {
            r3 = this;
            androidx.core.app.NotificationCompat$Builder r0 = r3.mBuilderCompat
            androidx.core.app.NotificationCompat$Style r0 = r0.mStyle
            if (r0 == 0) goto L9
            r0.apply(r3)
        L9:
            if (r0 == 0) goto L10
            android.widget.RemoteViews r1 = r0.makeContentView(r3)
            goto L11
        L10:
            r1 = 0
        L11:
            android.app.Notification r2 = r3.buildInternal()
            if (r1 == 0) goto L1a
            r2.contentView = r1
            goto L22
        L1a:
            androidx.core.app.NotificationCompat$Builder r1 = r3.mBuilderCompat
            android.widget.RemoteViews r1 = r1.mContentView
            if (r1 == 0) goto L22
            r2.contentView = r1
        L22:
            if (r0 == 0) goto L2c
            android.widget.RemoteViews r1 = r0.makeBigContentView(r3)
            if (r1 == 0) goto L2c
            r2.bigContentView = r1
        L2c:
            if (r0 == 0) goto L3a
            androidx.core.app.NotificationCompat$Builder r1 = r3.mBuilderCompat
            androidx.core.app.NotificationCompat$Style r1 = r1.mStyle
            android.widget.RemoteViews r1 = r1.makeHeadsUpContentView(r3)
            if (r1 == 0) goto L3a
            r2.headsUpContentView = r1
        L3a:
            if (r0 == 0) goto L45
            android.os.Bundle r1 = androidx.core.app.NotificationCompat.getExtras(r2)
            if (r1 == 0) goto L45
            r0.addCompatExtras(r1)
        L45:
            return r2
    }

    protected android.app.Notification buildInternal() {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Ld
            android.app.Notification$Builder r0 = r4.mBuilder
            android.app.Notification r0 = r0.build()
            return r0
        Ld:
            r1 = 24
            r2 = 1
            r3 = 2
            if (r0 < r1) goto L44
            android.app.Notification$Builder r0 = r4.mBuilder
            android.app.Notification r0 = r0.build()
            int r1 = r4.mGroupAlertBehavior
            if (r1 == 0) goto L43
            java.lang.String r1 = r0.getGroup()
            if (r1 == 0) goto L30
            int r1 = r0.flags
            r1 = r1 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L30
            int r1 = r4.mGroupAlertBehavior
            if (r1 != r3) goto L30
            r4.removeSoundAndVibration(r0)
        L30:
            java.lang.String r1 = r0.getGroup()
            if (r1 == 0) goto L43
            int r1 = r0.flags
            r1 = r1 & 512(0x200, float:7.175E-43)
            if (r1 != 0) goto L43
            int r1 = r4.mGroupAlertBehavior
            if (r1 != r2) goto L43
            r4.removeSoundAndVibration(r0)
        L43:
            return r0
        L44:
            android.app.Notification$Builder r0 = r4.mBuilder
            android.os.Bundle r1 = r4.mExtras
            r0.setExtras(r1)
            android.app.Notification$Builder r0 = r4.mBuilder
            android.app.Notification r0 = r0.build()
            android.widget.RemoteViews r1 = r4.mContentView
            if (r1 == 0) goto L57
            r0.contentView = r1
        L57:
            android.widget.RemoteViews r1 = r4.mBigContentView
            if (r1 == 0) goto L5d
            r0.bigContentView = r1
        L5d:
            android.widget.RemoteViews r1 = r4.mHeadsUpContentView
            if (r1 == 0) goto L63
            r0.headsUpContentView = r1
        L63:
            int r1 = r4.mGroupAlertBehavior
            if (r1 == 0) goto L8d
            java.lang.String r1 = r0.getGroup()
            if (r1 == 0) goto L7a
            int r1 = r0.flags
            r1 = r1 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L7a
            int r1 = r4.mGroupAlertBehavior
            if (r1 != r3) goto L7a
            r4.removeSoundAndVibration(r0)
        L7a:
            java.lang.String r1 = r0.getGroup()
            if (r1 == 0) goto L8d
            int r1 = r0.flags
            r1 = r1 & 512(0x200, float:7.175E-43)
            if (r1 != 0) goto L8d
            int r1 = r4.mGroupAlertBehavior
            if (r1 != r2) goto L8d
            r4.removeSoundAndVibration(r0)
        L8d:
            return r0
    }

    @Override // androidx.core.app.NotificationBuilderWithBuilderAccessor
    public android.app.Notification.Builder getBuilder() {
            r1 = this;
            android.app.Notification$Builder r0 = r1.mBuilder
            return r0
    }

    android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }
}
