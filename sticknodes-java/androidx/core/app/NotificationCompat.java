package androidx.core.app;

/* loaded from: classes.dex */
public class NotificationCompat {

    public static class Action {
        public android.app.PendingIntent actionIntent;

        @java.lang.Deprecated
        public int icon;
        private boolean mAllowGeneratedReplies;
        private boolean mAuthenticationRequired;
        private final androidx.core.app.RemoteInput[] mDataOnlyRemoteInputs;
        final android.os.Bundle mExtras;
        private androidx.core.graphics.drawable.IconCompat mIcon;
        private final boolean mIsContextual;
        private final androidx.core.app.RemoteInput[] mRemoteInputs;
        private final int mSemanticAction;
        boolean mShowsUserInterface;
        public java.lang.CharSequence title;

        public Action(int r3, java.lang.CharSequence r4, android.app.PendingIntent r5) {
                r2 = this;
                r0 = 0
                if (r3 != 0) goto L4
                goto La
            L4:
                java.lang.String r1 = ""
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createWithResource(r0, r1, r3)
            La:
                r2.<init>(r0, r4, r5)
                return
        }

        public Action(androidx.core.graphics.drawable.IconCompat r13, java.lang.CharSequence r14, android.app.PendingIntent r15) {
                r12 = this;
                android.os.Bundle r4 = new android.os.Bundle
                r4.<init>()
                r5 = 0
                r6 = 0
                r7 = 1
                r8 = 0
                r9 = 1
                r10 = 0
                r11 = 0
                r0 = r12
                r1 = r13
                r2 = r14
                r3 = r15
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return
        }

        Action(androidx.core.graphics.drawable.IconCompat r3, java.lang.CharSequence r4, android.app.PendingIntent r5, android.os.Bundle r6, androidx.core.app.RemoteInput[] r7, androidx.core.app.RemoteInput[] r8, boolean r9, int r10, boolean r11, boolean r12, boolean r13) {
                r2 = this;
                r2.<init>()
                r0 = 1
                r2.mShowsUserInterface = r0
                r2.mIcon = r3
                if (r3 == 0) goto L17
                int r0 = r3.getType()
                r1 = 2
                if (r0 != r1) goto L17
                int r3 = r3.getResId()
                r2.icon = r3
            L17:
                java.lang.CharSequence r3 = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(r4)
                r2.title = r3
                r2.actionIntent = r5
                if (r6 == 0) goto L22
                goto L27
            L22:
                android.os.Bundle r6 = new android.os.Bundle
                r6.<init>()
            L27:
                r2.mExtras = r6
                r2.mRemoteInputs = r7
                r2.mDataOnlyRemoteInputs = r8
                r2.mAllowGeneratedReplies = r9
                r2.mSemanticAction = r10
                r2.mShowsUserInterface = r11
                r2.mIsContextual = r12
                r2.mAuthenticationRequired = r13
                return
        }

        public android.app.PendingIntent getActionIntent() {
                r1 = this;
                android.app.PendingIntent r0 = r1.actionIntent
                return r0
        }

        public boolean getAllowGeneratedReplies() {
                r1 = this;
                boolean r0 = r1.mAllowGeneratedReplies
                return r0
        }

        public android.os.Bundle getExtras() {
                r1 = this;
                android.os.Bundle r0 = r1.mExtras
                return r0
        }

        public androidx.core.graphics.drawable.IconCompat getIconCompat() {
                r3 = this;
                androidx.core.graphics.drawable.IconCompat r0 = r3.mIcon
                if (r0 != 0) goto L11
                int r0 = r3.icon
                if (r0 == 0) goto L11
                r1 = 0
                java.lang.String r2 = ""
                androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createWithResource(r1, r2, r0)
                r3.mIcon = r0
            L11:
                androidx.core.graphics.drawable.IconCompat r0 = r3.mIcon
                return r0
        }

        public androidx.core.app.RemoteInput[] getRemoteInputs() {
                r1 = this;
                androidx.core.app.RemoteInput[] r0 = r1.mRemoteInputs
                return r0
        }

        public int getSemanticAction() {
                r1 = this;
                int r0 = r1.mSemanticAction
                return r0
        }

        public boolean getShowsUserInterface() {
                r1 = this;
                boolean r0 = r1.mShowsUserInterface
                return r0
        }

        public java.lang.CharSequence getTitle() {
                r1 = this;
                java.lang.CharSequence r0 = r1.title
                return r0
        }

        public boolean isAuthenticationRequired() {
                r1 = this;
                boolean r0 = r1.mAuthenticationRequired
                return r0
        }

        public boolean isContextual() {
                r1 = this;
                boolean r0 = r1.mIsContextual
                return r0
        }
    }

    public static class BigPictureStyle extends androidx.core.app.NotificationCompat.Style {
        private androidx.core.graphics.drawable.IconCompat mBigLargeIcon;
        private boolean mBigLargeIconSet;
        private java.lang.CharSequence mPictureContentDescription;
        private androidx.core.graphics.drawable.IconCompat mPictureIcon;
        private boolean mShowBigPictureWhenCollapsed;

        private static class Api16Impl {
            static void setBigLargeIcon(android.app.Notification.BigPictureStyle r0, android.graphics.Bitmap r1) {
                    r0.bigLargeIcon(r1)
                    return
            }

            static void setSummaryText(android.app.Notification.BigPictureStyle r0, java.lang.CharSequence r1) {
                    r0.setSummaryText(r1)
                    return
            }
        }

        private static class Api23Impl {
            static void setBigLargeIcon(android.app.Notification.BigPictureStyle r0, android.graphics.drawable.Icon r1) {
                    r0.bigLargeIcon(r1)
                    return
            }
        }

        private static class Api31Impl {
            static void setBigPicture(android.app.Notification.BigPictureStyle r0, android.graphics.drawable.Icon r1) {
                    r0.bigPicture(r1)
                    return
            }

            static void setContentDescription(android.app.Notification.BigPictureStyle r0, java.lang.CharSequence r1) {
                    r0.setContentDescription(r1)
                    return
            }

            static void showBigPictureWhenCollapsed(android.app.Notification.BigPictureStyle r0, boolean r1) {
                    r0.showBigPictureWhenCollapsed(r1)
                    return
            }
        }

        public BigPictureStyle() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor r8) {
                r7 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                android.app.Notification$BigPictureStyle r1 = new android.app.Notification$BigPictureStyle
                android.app.Notification$Builder r2 = r8.getBuilder()
                r1.<init>(r2)
                java.lang.CharSequence r2 = r7.mBigContentTitle
                android.app.Notification$BigPictureStyle r1 = r1.setBigContentTitle(r2)
                androidx.core.graphics.drawable.IconCompat r2 = r7.mPictureIcon
                r3 = 1
                r4 = 31
                r5 = 0
                if (r2 == 0) goto L42
                if (r0 < r4) goto L32
                boolean r2 = r8 instanceof androidx.core.app.NotificationCompatBuilder
                if (r2 == 0) goto L27
                r2 = r8
                androidx.core.app.NotificationCompatBuilder r2 = (androidx.core.app.NotificationCompatBuilder) r2
                android.content.Context r2 = r2.getContext()
                goto L28
            L27:
                r2 = r5
            L28:
                androidx.core.graphics.drawable.IconCompat r6 = r7.mPictureIcon
                android.graphics.drawable.Icon r2 = r6.toIcon(r2)
                androidx.core.app.NotificationCompat.BigPictureStyle.Api31Impl.setBigPicture(r1, r2)
                goto L42
            L32:
                int r2 = r2.getType()
                if (r2 != r3) goto L42
                androidx.core.graphics.drawable.IconCompat r2 = r7.mPictureIcon
                android.graphics.Bitmap r2 = r2.getBitmap()
                android.app.Notification$BigPictureStyle r1 = r1.bigPicture(r2)
            L42:
                boolean r2 = r7.mBigLargeIconSet
                if (r2 == 0) goto L79
                androidx.core.graphics.drawable.IconCompat r2 = r7.mBigLargeIcon
                if (r2 != 0) goto L4e
                androidx.core.app.NotificationCompat.BigPictureStyle.Api16Impl.setBigLargeIcon(r1, r5)
                goto L79
            L4e:
                r6 = 23
                if (r0 < r6) goto L66
                boolean r2 = r8 instanceof androidx.core.app.NotificationCompatBuilder
                if (r2 == 0) goto L5c
                androidx.core.app.NotificationCompatBuilder r8 = (androidx.core.app.NotificationCompatBuilder) r8
                android.content.Context r5 = r8.getContext()
            L5c:
                androidx.core.graphics.drawable.IconCompat r8 = r7.mBigLargeIcon
                android.graphics.drawable.Icon r8 = r8.toIcon(r5)
                androidx.core.app.NotificationCompat.BigPictureStyle.Api23Impl.setBigLargeIcon(r1, r8)
                goto L79
            L66:
                int r8 = r2.getType()
                if (r8 != r3) goto L76
                androidx.core.graphics.drawable.IconCompat r8 = r7.mBigLargeIcon
                android.graphics.Bitmap r8 = r8.getBitmap()
                androidx.core.app.NotificationCompat.BigPictureStyle.Api16Impl.setBigLargeIcon(r1, r8)
                goto L79
            L76:
                androidx.core.app.NotificationCompat.BigPictureStyle.Api16Impl.setBigLargeIcon(r1, r5)
            L79:
                boolean r8 = r7.mSummaryTextSet
                if (r8 == 0) goto L82
                java.lang.CharSequence r8 = r7.mSummaryText
                androidx.core.app.NotificationCompat.BigPictureStyle.Api16Impl.setSummaryText(r1, r8)
            L82:
                if (r0 < r4) goto L8e
                boolean r8 = r7.mShowBigPictureWhenCollapsed
                androidx.core.app.NotificationCompat.BigPictureStyle.Api31Impl.showBigPictureWhenCollapsed(r1, r8)
                java.lang.CharSequence r8 = r7.mPictureContentDescription
                androidx.core.app.NotificationCompat.BigPictureStyle.Api31Impl.setContentDescription(r1, r8)
            L8e:
                return
        }

        public androidx.core.app.NotificationCompat.BigPictureStyle bigLargeIcon(android.graphics.Bitmap r1) {
                r0 = this;
                if (r1 != 0) goto L4
                r1 = 0
                goto L8
            L4:
                androidx.core.graphics.drawable.IconCompat r1 = androidx.core.graphics.drawable.IconCompat.createWithBitmap(r1)
            L8:
                r0.mBigLargeIcon = r1
                r1 = 1
                r0.mBigLargeIconSet = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.BigPictureStyle bigPicture(android.graphics.Bitmap r1) {
                r0 = this;
                if (r1 != 0) goto L4
                r1 = 0
                goto L8
            L4:
                androidx.core.graphics.drawable.IconCompat r1 = androidx.core.graphics.drawable.IconCompat.createWithBitmap(r1)
            L8:
                r0.mPictureIcon = r1
                return r0
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected java.lang.String getClassName() {
                r1 = this;
                java.lang.String r0 = "androidx.core.app.NotificationCompat$BigPictureStyle"
                return r0
        }
    }

    public static class BigTextStyle extends androidx.core.app.NotificationCompat.Style {
        private java.lang.CharSequence mBigText;

        public BigTextStyle() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(android.os.Bundle r1) {
                r0 = this;
                super.addCompatExtras(r1)
                return
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor r2) {
                r1 = this;
                android.app.Notification$BigTextStyle r0 = new android.app.Notification$BigTextStyle
                android.app.Notification$Builder r2 = r2.getBuilder()
                r0.<init>(r2)
                java.lang.CharSequence r2 = r1.mBigContentTitle
                android.app.Notification$BigTextStyle r2 = r0.setBigContentTitle(r2)
                java.lang.CharSequence r0 = r1.mBigText
                android.app.Notification$BigTextStyle r2 = r2.bigText(r0)
                boolean r0 = r1.mSummaryTextSet
                if (r0 == 0) goto L1e
                java.lang.CharSequence r0 = r1.mSummaryText
                r2.setSummaryText(r0)
            L1e:
                return
        }

        public androidx.core.app.NotificationCompat.BigTextStyle bigText(java.lang.CharSequence r1) {
                r0 = this;
                java.lang.CharSequence r1 = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(r1)
                r0.mBigText = r1
                return r0
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected java.lang.String getClassName() {
                r1 = this;
                java.lang.String r0 = "androidx.core.app.NotificationCompat$BigTextStyle"
                return r0
        }
    }

    public static final class BubbleMetadata {
        public static android.app.Notification.BubbleMetadata toPlatform(androidx.core.app.NotificationCompat.BubbleMetadata r0) {
                r0 = 0
                return r0
        }
    }

    public static class Builder {
        public java.util.ArrayList<androidx.core.app.NotificationCompat.Action> mActions;
        boolean mAllowSystemGeneratedContextualActions;
        int mBadgeIcon;
        android.widget.RemoteViews mBigContentView;
        java.lang.String mCategory;
        java.lang.String mChannelId;
        int mColor;
        boolean mColorized;
        boolean mColorizedSet;
        java.lang.CharSequence mContentInfo;
        android.app.PendingIntent mContentIntent;
        java.lang.CharSequence mContentText;
        java.lang.CharSequence mContentTitle;
        android.widget.RemoteViews mContentView;
        public android.content.Context mContext;
        android.os.Bundle mExtras;
        int mFgsDeferBehavior;
        android.app.PendingIntent mFullScreenIntent;
        int mGroupAlertBehavior;
        java.lang.String mGroupKey;
        boolean mGroupSummary;
        android.widget.RemoteViews mHeadsUpContentView;
        java.util.ArrayList<androidx.core.app.NotificationCompat.Action> mInvisibleActions;
        android.graphics.Bitmap mLargeIcon;
        boolean mLocalOnly;
        android.app.Notification mNotification;
        int mNumber;

        @java.lang.Deprecated
        public java.util.ArrayList<java.lang.String> mPeople;
        public java.util.ArrayList<androidx.core.app.Person> mPersonList;
        int mPriority;
        int mProgress;
        boolean mProgressIndeterminate;
        int mProgressMax;
        android.app.Notification mPublicVersion;
        java.lang.CharSequence[] mRemoteInputHistory;
        java.lang.CharSequence mSettingsText;
        java.lang.String mShortcutId;
        boolean mShowWhen;
        boolean mSilent;
        android.graphics.drawable.Icon mSmallIcon;
        java.lang.String mSortKey;
        androidx.core.app.NotificationCompat.Style mStyle;
        java.lang.CharSequence mSubText;
        android.widget.RemoteViews mTickerView;
        long mTimeout;
        boolean mUseChronometer;
        int mVisibility;

        @java.lang.Deprecated
        public Builder(android.content.Context r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        public Builder(android.content.Context r4, java.lang.String r5) {
                r3 = this;
                r3.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r3.mActions = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r3.mPersonList = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r3.mInvisibleActions = r0
                r0 = 1
                r3.mShowWhen = r0
                r1 = 0
                r3.mLocalOnly = r1
                r3.mColor = r1
                r3.mVisibility = r1
                r3.mBadgeIcon = r1
                r3.mGroupAlertBehavior = r1
                r3.mFgsDeferBehavior = r1
                android.app.Notification r2 = new android.app.Notification
                r2.<init>()
                r3.mNotification = r2
                r3.mContext = r4
                r3.mChannelId = r5
                long r4 = java.lang.System.currentTimeMillis()
                r2.when = r4
                android.app.Notification r4 = r3.mNotification
                r5 = -1
                r4.audioStreamType = r5
                r3.mPriority = r1
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                r3.mPeople = r4
                r3.mAllowSystemGeneratedContextualActions = r0
                return
        }

        protected static java.lang.CharSequence limitCharSequenceLength(java.lang.CharSequence r2) {
                if (r2 != 0) goto L3
                return r2
            L3:
                int r0 = r2.length()
                r1 = 5120(0x1400, float:7.175E-42)
                if (r0 <= r1) goto L10
                r0 = 0
                java.lang.CharSequence r2 = r2.subSequence(r0, r1)
            L10:
                return r2
        }

        private android.graphics.Bitmap reduceLargeIconSize(android.graphics.Bitmap r10) {
                r9 = this;
                if (r10 == 0) goto L5f
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 27
                if (r0 < r1) goto L9
                goto L5f
            L9:
                android.content.Context r0 = r9.mContext
                android.content.res.Resources r0 = r0.getResources()
                int r1 = androidx.core.R$dimen.compat_notification_large_icon_max_width
                int r1 = r0.getDimensionPixelSize(r1)
                int r2 = androidx.core.R$dimen.compat_notification_large_icon_max_height
                int r0 = r0.getDimensionPixelSize(r2)
                int r2 = r10.getWidth()
                if (r2 > r1) goto L28
                int r2 = r10.getHeight()
                if (r2 > r0) goto L28
                return r10
            L28:
                double r1 = (double) r1
                int r3 = r10.getWidth()
                r4 = 1
                int r3 = java.lang.Math.max(r4, r3)
                double r5 = (double) r3
                double r1 = r1 / r5
                double r5 = (double) r0
                int r0 = r10.getHeight()
                int r0 = java.lang.Math.max(r4, r0)
                double r7 = (double) r0
                double r5 = r5 / r7
                double r0 = java.lang.Math.min(r1, r5)
                int r2 = r10.getWidth()
                double r2 = (double) r2
                double r2 = r2 * r0
                double r2 = java.lang.Math.ceil(r2)
                int r2 = (int) r2
                int r3 = r10.getHeight()
                double r5 = (double) r3
                double r5 = r5 * r0
                double r0 = java.lang.Math.ceil(r5)
                int r0 = (int) r0
                android.graphics.Bitmap r10 = android.graphics.Bitmap.createScaledBitmap(r10, r2, r0, r4)
            L5f:
                return r10
        }

        private void setFlag(int r2, boolean r3) {
                r1 = this;
                if (r3 == 0) goto La
                android.app.Notification r3 = r1.mNotification
                int r0 = r3.flags
                r2 = r2 | r0
                r3.flags = r2
                goto L12
            La:
                android.app.Notification r3 = r1.mNotification
                int r0 = r3.flags
                int r2 = ~r2
                r2 = r2 & r0
                r3.flags = r2
            L12:
                return
        }

        public androidx.core.app.NotificationCompat.Builder addAction(int r3, java.lang.CharSequence r4, android.app.PendingIntent r5) {
                r2 = this;
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r0 = r2.mActions
                androidx.core.app.NotificationCompat$Action r1 = new androidx.core.app.NotificationCompat$Action
                r1.<init>(r3, r4, r5)
                r0.add(r1)
                return r2
        }

        public android.app.Notification build() {
                r1 = this;
                androidx.core.app.NotificationCompatBuilder r0 = new androidx.core.app.NotificationCompatBuilder
                r0.<init>(r1)
                android.app.Notification r0 = r0.build()
                return r0
        }

        public android.os.Bundle getExtras() {
                r1 = this;
                android.os.Bundle r0 = r1.mExtras
                if (r0 != 0) goto Lb
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                r1.mExtras = r0
            Lb:
                android.os.Bundle r0 = r1.mExtras
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setAutoCancel(boolean r2) {
                r1 = this;
                r0 = 16
                r1.setFlag(r0, r2)
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setChannelId(java.lang.String r1) {
                r0 = this;
                r0.mChannelId = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setContentIntent(android.app.PendingIntent r1) {
                r0 = this;
                r0.mContentIntent = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setContentText(java.lang.CharSequence r1) {
                r0 = this;
                java.lang.CharSequence r1 = limitCharSequenceLength(r1)
                r0.mContentText = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setContentTitle(java.lang.CharSequence r1) {
                r0 = this;
                java.lang.CharSequence r1 = limitCharSequenceLength(r1)
                r0.mContentTitle = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setDeleteIntent(android.app.PendingIntent r2) {
                r1 = this;
                android.app.Notification r0 = r1.mNotification
                r0.deleteIntent = r2
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setLargeIcon(android.graphics.Bitmap r1) {
                r0 = this;
                android.graphics.Bitmap r1 = r0.reduceLargeIconSize(r1)
                r0.mLargeIcon = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setLocalOnly(boolean r1) {
                r0 = this;
                r0.mLocalOnly = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setPriority(int r1) {
                r0 = this;
                r0.mPriority = r1
                return r0
        }

        public androidx.core.app.NotificationCompat.Builder setSmallIcon(int r2) {
                r1 = this;
                android.app.Notification r0 = r1.mNotification
                r0.icon = r2
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setStyle(androidx.core.app.NotificationCompat.Style r2) {
                r1 = this;
                androidx.core.app.NotificationCompat$Style r0 = r1.mStyle
                if (r0 == r2) goto Lb
                r1.mStyle = r2
                if (r2 == 0) goto Lb
                r2.setBuilder(r1)
            Lb:
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setTicker(java.lang.CharSequence r2) {
                r1 = this;
                android.app.Notification r0 = r1.mNotification
                java.lang.CharSequence r2 = limitCharSequenceLength(r2)
                r0.tickerText = r2
                return r1
        }

        public androidx.core.app.NotificationCompat.Builder setWhen(long r2) {
                r1 = this;
                android.app.Notification r0 = r1.mNotification
                r0.when = r2
                return r1
        }
    }

    public static abstract class Style {
        java.lang.CharSequence mBigContentTitle;
        protected androidx.core.app.NotificationCompat.Builder mBuilder;
        java.lang.CharSequence mSummaryText;
        boolean mSummaryTextSet;

        public Style() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mSummaryTextSet = r0
                return
        }

        public void addCompatExtras(android.os.Bundle r3) {
                r2 = this;
                boolean r0 = r2.mSummaryTextSet
                if (r0 == 0) goto Lb
                java.lang.CharSequence r0 = r2.mSummaryText
                java.lang.String r1 = "android.summaryText"
                r3.putCharSequence(r1, r0)
            Lb:
                java.lang.CharSequence r0 = r2.mBigContentTitle
                if (r0 == 0) goto L14
                java.lang.String r1 = "android.title.big"
                r3.putCharSequence(r1, r0)
            L14:
                java.lang.String r0 = r2.getClassName()
                if (r0 == 0) goto L1f
                java.lang.String r1 = "androidx.core.app.extra.COMPAT_TEMPLATE"
                r3.putString(r1, r0)
            L1f:
                return
        }

        public abstract void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor r1);

        protected abstract java.lang.String getClassName();

        public android.widget.RemoteViews makeBigContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public android.widget.RemoteViews makeContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public android.widget.RemoteViews makeHeadsUpContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void setBuilder(androidx.core.app.NotificationCompat.Builder r2) {
                r1 = this;
                androidx.core.app.NotificationCompat$Builder r0 = r1.mBuilder
                if (r0 == r2) goto Lb
                r1.mBuilder = r2
                if (r2 == 0) goto Lb
                r2.setStyle(r1)
            Lb:
                return
        }
    }

    public static android.os.Bundle getExtras(android.app.Notification r0) {
            android.os.Bundle r0 = r0.extras
            return r0
    }
}
