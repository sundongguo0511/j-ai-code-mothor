package com.jelly.jaicodemothor.core.saver;

import cn.hutool.core.util.StrUtil;
import com.jelly.jaicodemothor.ai.model.HtmlCodeResult;
import com.jelly.jaicodemothor.exception.BusinessException;
import com.jelly.jaicodemothor.exception.ErrorCode;
import com.jelly.jaicodemothor.model.enums.CodeGenTypeEnum;

/**
 * HTML代码文件保存器
 *
 * @author jelly
 * @date 2025/8/9
 */
public class HtmlCodeFileSaverTemplate extends CodeFileSaverTemplate<HtmlCodeResult> {

    @Override
    protected CodeGenTypeEnum getCodeType() {
        return CodeGenTypeEnum.HTML;
    }

    @Override
    protected void saveFiles(HtmlCodeResult result, String baseDirPath) {
        // 保存 HTML 文件
        writeToFile(baseDirPath, "index.html", result.getHtmlCode());
    }

    @Override
    protected void validateInput(HtmlCodeResult result) {
        super.validateInput(result);
        if (StrUtil.isBlank(result.getHtmlCode())) {
            throw new BusinessException(ErrorCode.SYSTEM_ERROR, "HTML代码内容不能为空");
        }
    }
}
