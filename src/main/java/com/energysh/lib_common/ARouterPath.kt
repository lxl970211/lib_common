package com.energysh.lib_common

class ARouterPath {

    object ActivityPath{
        /**
         * 123
         * 123
         * 123
         * 123
         */
        const val AROUTER_GALLERY = "/quickart/gallery"
        /**
         * 分享界面
         */
        const val AROUTER_SHARE = "/quickart/share"

        /**
         * 登录界面
         */
        const val AROUTER_LOGIN = "/login/login"

        /**
         * 一键登录界面
         */
        const val AROUTER_AUTO_LOGIN = "/login/autoLogin"

        /**
         * 应用内网页界面
         */
        const val AROUTER_FESTIVAL_WEB = "/quickart/festivalWeb"

        /**
         * 注销协议界面
         */
        const val AROUTER_LOGOUT = "/quickart/logoutAgreement"

        /**
         * 账号已在其他设备登录提示界面
         */
        const val AROUTER_LOGIN_TIPS = "/quickart/loginTipsActivity"

        /**
         * vip促销界面
         */
        const val VIP_PROMOTION_ACTIVITY = "/vip/vipPromotion"

        /**
         * vip购买界面
         */
        const val VIP_PRODUCT_ACTIVITY = "/vip/product"

        const val TEST_ACTIVITY = "/test/testActivity"

        /**
         * 艺术滤镜功能列表
         */
        const val ART_FILTER = "/art/artFilter"

        /**
         * 艺术滤镜测试
         */
        const val ART_FILTER_TEST = "/art/artFilterTest"
        const val ART_FILTER_MATERIAL_CENTER = "/art/artFilterMaterialCenter"
    }

    object FragmentPath{

        /**
         * 国服用户协议fragmentDialog
         */
        const val AROUTER_PRIVACY_AGREEMENT = "/dialog/privacyAgreement"

        /**
         * 加载dialogfragment
         */
        const val LOADING = "/dialog/loading"

        /**
         * 国服首页显示的次日红包弹窗
         */
        const val VIP_SALE_DIALOG = "/vip/vipSaleDialog"

        /**
         * 看激励广告视频的提示弹窗
         */
        const val WATCH_AD_TIPS = "/ad/rewardedVideo"


        /**
         * 素材举报弹窗
         */
        const val MATERIAL_REPORT_DIALOG = "/material/report"
    }

    object SERVICE{

        const val REWARDED_VIDEO = "/service/rewarded_video"

    }


}