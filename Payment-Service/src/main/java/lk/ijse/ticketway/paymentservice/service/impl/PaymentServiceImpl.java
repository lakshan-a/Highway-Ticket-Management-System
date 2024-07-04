package lk.ijse.ticketway.paymentservice.service.impl;

import lk.ijse.ticketway.paymentservice.dto.PaymentDTO;
import lk.ijse.ticketway.paymentservice.repository.PaymentRepository;
import lk.ijse.ticketway.paymentservice.service.PaymentService;
import lk.ijse.ticketway.paymentservice.util.ResponseDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

/**
 * @version: v0.0.1
 * @author: lakshanR
 * @date: 7/1/2024
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;
    private final ModelMapper modelMapper;

    public PaymentServiceImpl(PaymentRepository paymentRepository, ModelMapper modelMapper) {
        this.paymentRepository = paymentRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public ResponseDTO add(PaymentDTO paymentDTO) {
        Payment save = paymentRepository.save(modelMapper.map(paymentDTO, Payment.class));
        return save != null ? new ResponseDTO("Success", 200) : new ResponseDTO("Error", 500);
    }

    @Override
    public ResponseDTO update(PaymentDTO paymentDTO) {
        Payment save = paymentRepository.save(modelMapper.map(paymentDTO, Payment.class));
        return save != null ? new ResponseDTO("Success", 200) : new ResponseDTO("Error", 500);
    }
}
